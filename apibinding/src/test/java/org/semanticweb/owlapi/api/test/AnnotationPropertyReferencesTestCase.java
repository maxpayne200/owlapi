package org.semanticweb.owlapi.api.test;

import org.semanticweb.owlapi.model.*;

import java.util.Set;
import java.util.Collections;
/*
 * Copyright (C) 2009, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

/**
 * Author: Matthew Horridge<br>
 * The University of Manchester<br>
 * Information Management Group<br>
 * Date: 28-May-2009
 */
public class AnnotationPropertyReferencesTestCase extends AbstractOWLAPITestCase {

    public void testContainsReferenceForAnnotationAssertion() throws Exception {
        OWLAnnotationProperty ap = getOWLAnnotationProperty("prop");
        OWLLiteral val = getFactory().getOWLStringLiteral("Test", null);
        OWLAnnotationSubject subject = getOWLClass("A").getIRI();
        OWLAnnotationAssertionAxiom ax = getFactory().getOWLAnnotationAssertionAxiom(ap, subject, val);
        OWLOntology ont = getOWLOntology("Ont");
        getManager().addAxiom(ont, ax);
        assertTrue(ont.containsAnnotationPropertyReference(ap.getIRI()));
        assertTrue(ont.getReferencedAnnotationProperties().contains(ap));
    }
    

    public void testContainsReferenceForAxiomAnnotation() throws Exception {
        OWLAnnotationProperty ap = getOWLAnnotationProperty("prop");
        OWLLiteral val = getFactory().getOWLStringLiteral("Test", null);
        OWLAnnotation anno = getFactory().getOWLAnnotation(ap, val);
        Set<OWLAnnotation> annos = Collections.singleton(anno);
        OWLSubClassOfAxiom ax = getFactory().getOWLSubClassOfAxiom(getOWLClass("A"), getOWLClass("B"), annos);
        OWLOntology ont = getOWLOntology("Ont");
        getManager().addAxiom(ont, ax);
        assertTrue(ont.containsAnnotationPropertyReference(anno.getProperty().getIRI()));
        assertTrue(ont.getReferencedAnnotationProperties().contains(anno.getProperty()));
    }

    public void testContainsReferenceForOntologyAnnotation() throws Exception {
        OWLAnnotationProperty ap = getOWLAnnotationProperty("prop");
        OWLLiteral val = getFactory().getOWLStringLiteral("Test");
        OWLAnnotation anno = getFactory().getOWLAnnotation(ap, val);
        OWLOntology ont = getOWLOntology("Ont");
        getManager().applyChange(new AddOntologyAnnotation(ont, anno));
        assertTrue(ont.containsAnnotationPropertyReference(anno.getProperty().getIRI()));
        assertTrue(ont.getReferencedAnnotationProperties().contains(anno.getProperty()));
    }


}