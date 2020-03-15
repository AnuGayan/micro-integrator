/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.micro.integrator.ntask.coordination.task;

/**
 * Representation of coordinated task.
 */
public class CoordinatedTask {

    /**
     * Name of the task.
     */
    private String taskName;

    /**
     * Node to which the task is assigned.
     */
    private String destinedNodeId;

    /**
     * State of the task.
     *
     * @see States
     */
    private States taskState;

    public CoordinatedTask(String taskName, String destinedNodeId, States taskState) {

        this.taskName = taskName;
        this.destinedNodeId = destinedNodeId;
        this.taskState = taskState;
    }

    public String getDestinedNodeId() {
        return this.destinedNodeId;
    }

    public States getTaskState() {
        return this.taskState;
    }

    public void setTaskState(States state) {
        this.taskState = state;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public enum States {
        NONE,
        RUNNING,
        PAUSED,
        COMPLETED
    }
}
