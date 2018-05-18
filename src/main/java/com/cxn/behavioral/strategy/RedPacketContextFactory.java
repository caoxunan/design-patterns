package com.cxn.behavioral.strategy;

import com.cxn.behavioral.strategy.concrete.LineSegmentCuttingStrategy;
import com.cxn.behavioral.strategy.concrete.TwoTimesMainValueStrategy;

import java.util.List;

/**
 * @program: design-patterns
 * @description: 红包策略工厂（策略模式 + 简单工厂模式）
 * 将实例化具体策略的过程由客户端转移到具体策略工厂类中
 * @author: cxn
 * @create: 2018-05-18 10:50
 * @Version v1.0
 */
public class RedPacketContextFactory {

    private AbstractRedPacketStrategy redPacketStrategy;

    public RedPacketContextFactory(RedPacketStrategyEnum strategyEnum) {
        switch (strategyEnum) {
            case TWO_TIMES_MAIN_VALUE:
                this.redPacketStrategy = new TwoTimesMainValueStrategy();
                break;
            case LINE_SEGMENT_CUTTING:
                this.redPacketStrategy = new LineSegmentCuttingStrategy();
                break;
            default:
                break;
        }
    }

    public List<Integer> divideRedPacketAmount(Integer totalAmount, Integer totalPeopleNum){
        return redPacketStrategy.divideRedPacket(totalAmount, totalPeopleNum);
    }
}
