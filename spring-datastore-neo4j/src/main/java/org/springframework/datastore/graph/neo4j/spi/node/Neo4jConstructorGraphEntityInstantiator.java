/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.datastore.graph.neo4j.spi.node;

import org.neo4j.graphdb.Node;
import org.springframework.datastore.graph.api.NodeBacked;
import org.springframework.persistence.support.AbstractConstructorEntityInstantiator;

/**
 * Try for a constructor taking a Neo4j Node: failing that, try a no-arg
 * constructor and then setUnderlyingState().
 * 
 * @author Rod Johnson
 */
public class Neo4jConstructorGraphEntityInstantiator extends AbstractConstructorEntityInstantiator<NodeBacked, Node>{
	
	@Override
	protected void setState(NodeBacked entity, Node s) {
		entity.setUnderlyingState(s);
	}

}