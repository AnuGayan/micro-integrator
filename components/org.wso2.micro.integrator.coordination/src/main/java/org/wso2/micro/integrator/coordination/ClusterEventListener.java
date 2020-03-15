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

package org.wso2.micro.integrator.coordination;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.micro.integrator.coordination.node.NodeDetail;

/**
 * The event listener which is registered to capture the cluster changes for audit purposes.
 */
public class ClusterEventListener extends MemberEventListener {

    private static final Log LOG = LogFactory.getLog(ClusterCoordinator.class);

    @Override
    public void memberAdded(NodeDetail nodeDetail) {
        LOG.info("Member added : [" + nodeDetail.getNodeId() + "]");
    }

    @Override
    public void memberRemoved(NodeDetail nodeDetail) {
        LOG.info("Member removed : [" + nodeDetail.getNodeId() + "]");
    }

    @Override
    public void coordinatorChanged(NodeDetail nodeDetail) {
        LOG.info("Coordinator changed to : [" + nodeDetail.getNodeId() + "]");
    }

    @Override
    public void becameUnresponsive(String nodeId) {
        LOG.info("This node lost connection to the cluster.");
    }

    @Override
    public void reJoined(String nodeId) {
        LOG.info("This node re-joined the cluster successfully.");
    }
}
