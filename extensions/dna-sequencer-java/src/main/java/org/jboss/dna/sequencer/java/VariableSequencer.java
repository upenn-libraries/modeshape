/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008-2009, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.dna.sequencer.java;

import org.jboss.dna.graph.property.NameFactory;
import org.jboss.dna.graph.property.Path;
import org.jboss.dna.graph.sequencer.SequencerOutput;
import org.jboss.dna.sequencer.java.metadata.Variable;

/**
 * Sequencer for variabels.
 * @author Perge Pagop
 *
 */
public class VariableSequencer implements JavaSourceCndDefinition {
    
    /**
     * Sequence a variable.
     * 
     * @param output - the {@link SequencerOutput}.
     * @param nameFactory - the {@link NameFactory}.
     * @param variable - the variable to be added in the tree.
     * @param path - the path
     */
    public static void sequenceTheVariable( SequencerOutput output,
                                      NameFactory nameFactory,
                                      Variable variable,
                                      Path path ) {
        output.setProperty(path, nameFactory.create(JAVA_VARIABLE_NAME), variable.getName());
    }
}
