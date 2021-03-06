package com.xbruce.behavioral.strategy;

import java.util.List;

/**
 * @program: design-patterns
 * @description: 红包抽象策略类
 * @author: xbruce
 * @create: 2018-05-18 09:45
 * @Version v1.0
 */
public abstract class AbstractRedPacketStrategy {

    /**
     * 定义红包金额算法（subject musts override this method）
     * @param totalAmount 总金额（单位：分）
     * @param totalPeopleNum 总人数
     * @return 根据不同策略分配的红包金额集合
     */
    public List<Integer> divideRedPacket(Integer totalAmount, Integer totalPeopleNum ){
        return null;
    }

}
