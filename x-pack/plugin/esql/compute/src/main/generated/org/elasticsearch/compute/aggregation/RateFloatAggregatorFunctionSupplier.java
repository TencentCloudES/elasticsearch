// Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
// or more contributor license agreements. Licensed under the Elastic License
// 2.0; you may not use this file except in compliance with the Elastic License
// 2.0.
package org.elasticsearch.compute.aggregation;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import org.elasticsearch.compute.operator.DriverContext;

/**
 * {@link AggregatorFunctionSupplier} implementation for {@link RateFloatAggregator}.
 * This class is generated. Do not edit it.
 */
public final class RateFloatAggregatorFunctionSupplier implements AggregatorFunctionSupplier {
  private final List<Integer> channels;

  private final long unitInMillis;

  public RateFloatAggregatorFunctionSupplier(List<Integer> channels, long unitInMillis) {
    this.channels = channels;
    this.unitInMillis = unitInMillis;
  }

  @Override
  public AggregatorFunction aggregator(DriverContext driverContext) {
    throw new UnsupportedOperationException("non-grouping aggregator is not supported");
  }

  @Override
  public RateFloatGroupingAggregatorFunction groupingAggregator(DriverContext driverContext) {
    return RateFloatGroupingAggregatorFunction.create(channels, driverContext, unitInMillis);
  }

  @Override
  public String describe() {
    return "rate of floats";
  }
}
