package com.cxn.behavioral.strategy;

/**
 * @program: design-patterns
 * @description: 红包策略枚举类
 * @author: cxn
 * @create: 2018-05-18 10:47
 * @Version v1.0
 */
public enum RedPacketStrategyEnum {
    /**
     * 二倍均值算法
     */
    TWO_TIMES_MAIN_VALUE,

    /**
     * 线段切割算法
     */
    LINE_SEGMENT_CUTTING;
}
