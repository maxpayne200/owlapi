/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.semanticweb.owlapi.util;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLDataRangeAtom;
import org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLSameIndividualAtom;
import org.semanticweb.owlapi.model.SWRLVariable;

/** Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 22-Nov-2006<br>
 * <br> */
public class OWLObjectVisitorAdapter extends OWLAxiomVisitorAdapter implements
        OWLObjectVisitor {

    @Override
    public void visit(OWLOntology ontology) {
        doDefault(ontology);
    }

    @Override
    public void visit(OWLClass desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLDataAllValuesFrom desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLDataExactCardinality desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLDataMaxCardinality desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLDataMinCardinality desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLDataSomeValuesFrom desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLDataHasValue desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectAllValuesFrom desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectComplementOf desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectExactCardinality desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectHasSelf desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectHasValue desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectIntersectionOf desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectMaxCardinality desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectMinCardinality desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectOneOf desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectSomeValuesFrom desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLObjectUnionOf desc) {
        doDefault(desc);
    }

    @Override
    public void visit(OWLFacetRestriction node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLLiteral node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLDataComplementOf node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLDataIntersectionOf node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLDataOneOf node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLDatatype node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLDatatypeRestriction node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLDataUnionOf node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLDataProperty property) {
        doDefault(property);
    }

    @Override
    public void visit(OWLObjectProperty property) {
        doDefault(property);
    }

    @Override
    public void visit(OWLObjectInverseOf property) {
        doDefault(property);
    }

    @Override
    public void visit(OWLNamedIndividual individual) {
        doDefault(individual);
    }

    @Override
    public void visit(OWLAnnotationProperty property) {
        doDefault(property);
    }

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {
        doDefault(axiom);
    }

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {
        doDefault(axiom);
    }

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {
        doDefault(axiom);
    }

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {
        doDefault(axiom);
    }

    @Override
    public void visit(OWLAnonymousIndividual individual) {
        doDefault(individual);
    }

    @Override
    public void visit(IRI iri) {
        doDefault(iri);
    }

    @Override
    public void visit(OWLAnnotation node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLLiteralArgument node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLIndividualArgument node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLVariable node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLBuiltInAtom node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLClassAtom node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLDataRangeAtom node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLDataPropertyAtom node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLObjectPropertyAtom node) {
        doDefault(node);
    }

    @Override
    public void visit(SWRLSameIndividualAtom node) {
        doDefault(node);
    }

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {
        doDefault(axiom);
    }
}
