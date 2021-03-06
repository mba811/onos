/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onlab.graph;

/**
 * Representation of a graph edge.
 *
 * @param <V> vertex type
 */
public interface Edge<V extends Vertex> {

    /**
     * Returns the edge source vertex.
     *
     * @return source vertex
     */
    V src();

    /**
     * Returns the edge destination vertex.
     *
     * @return destination vertex
     */
    V dst();

}
