package com.cxn.behavioral.strategy;

import java.util.List;

/**
 * @program: design-patterns
 * @description: 红包策略的上下文
 * @author: cxn
 * @create: 2018-05-18 10:33
 * @Version v1.0
 */
public class RedPacketContext {

    private AbstractRedPacketStrategy redPacketStrategy;

    public RedPacketContext(AbstractRedPacketStrategy redPacketStrategy) {
        this.redPacketStrategy = redPacketStrategy;
    }

    public List<Integer> divideRedPacketAmount(Integer totalAmount, Integer totalPeopleNum){
        return redPacketStrategy.divideRedPacket(totalAmount, totalPeopleNum);
    }
}
