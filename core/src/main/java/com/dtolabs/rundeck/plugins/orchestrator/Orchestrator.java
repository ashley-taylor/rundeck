/*
 * Copyright 2012 DTO Labs, Inc. (http://dtolabs.com)
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
 *
 */
package com.dtolabs.rundeck.plugins.orchestrator;

import com.dtolabs.rundeck.core.common.INodeEntry;
/**
 * Orchestrator is created for each execution this deals with the actual selection of nodes
 *
 * @author Ashley Taylor
 */
public interface Orchestrator {

    public INodeEntry getNode();

    public void returnNode(INodeEntry node);

}