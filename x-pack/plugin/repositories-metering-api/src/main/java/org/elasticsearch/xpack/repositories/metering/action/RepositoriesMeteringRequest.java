/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.repositories.metering.action;

import org.elasticsearch.action.support.nodes.BaseNodesRequest;

public final class RepositoriesMeteringRequest extends BaseNodesRequest<RepositoriesMeteringRequest> {
    public RepositoriesMeteringRequest(String... nodesIds) {
        super(nodesIds);
    }
}
