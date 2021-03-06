package com.xbruce.behavioral.strategy.test;

import com.xbruce.behavioral.strategy.RedPacketContext;
import com.xbruce.behavioral.strategy.concrete.LineSegmentCuttingStrategy;
import com.xbruce.behavioral.strategy.concrete.TwoTimesMainValueStrategy;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: design-patterns
 * @description: 策略模式的测试类
 * @author: xbruce
 * @create: 2018-05-18 10:37
 * @Version v1.0
 */
public class StrategyContextTest {

    public static void main(String[] args) {
        Integer totalAmount = 10000;
        Integer totalPeopleNum = 10;

        // 定义具体使用策略
        LineSegmentCuttingStrategy lineSegmentCuttingStrategy = new LineSegmentCuttingStrategy();
        // 获得红包策略上下文
        RedPacketContext redPacketContext = new RedPacketContext(lineSegmentCuttingStrategy);

        // 调用具体的红包生成算法，获得结果
        List<Integer> amountList = redPacketContext.divideRedPacketAmount(totalAmount, totalPeopleNum);

        int amount = 0;
        for (Integer currentAmount : amountList) {
            System.out.println("二倍均值算法-->抢到金额：" + new BigDecimal(currentAmount).divide(new BigDecimal(100)));
            amount += currentAmount;
        }
        System.out.println("二倍均值算法-->总金额:" + amount);

        TwoTimesMainValueStrategy twoTimesMainValueStrategy = new TwoTimesMainValueStrategy();
        // 获得红包策略上下文
        RedPacketContext redPacketContext2 = new RedPacketContext(twoTimesMainValueStrategy);

        // 调用具体的红包生成算法，获得结果
        List<Integer> amountList2 = redPacketContext2.divideRedPacketAmount(totalAmount, totalPeopleNum);

        int amount2 = 0;
        for (Integer currentAmount : amountList2) {
            System.out.println("线段切割算法-->抢到金额：" + new BigDecimal(currentAmount).divide(new BigDecimal(100)));
            amount2 += currentAmount;
        }
        System.out.println("线段切割算法-->总金额:" + amount2);


    }

}
