/*
 * Copyright 1999-2020 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.slots.block.degrade.circuitbreaker;

/**
 * @author Eric Zhao
 * @since 1.8.0
 */
public enum CircuitBreakerStrategy {

    /**
     * Circuit breaker opens (cuts off) when slow request ratio exceeds the threshold.
     * 熔断器按照慢请求比率进行降级
     */
    SLOW_REQUEST_RATIO(0),
    /**
     * Circuit breaker opens (cuts off) when error ratio exceeds the threshold.
     * 按照错误数据比率进行降级
     */
    ERROR_RATIO(1),
    /**
     * Circuit breaker opens (cuts off) when error count exceeds the threshold.
     * 按照错误数量进行降级
     */
    ERROR_COUNT(2);

    private int type;

    CircuitBreakerStrategy(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
