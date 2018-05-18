package com.cxn.behavioral.strategy.test;

import com.cxn.behavioral.strategy.RedPacketContextFactory;
import com.cxn.behavioral.strategy.RedPacketStrategyEnum;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: design-patterns
 * @description: 红包策略模式 结合 工厂模式 测试类
 * @author: cxn
 * @create: 2018-05-18 11:01
 * @Version v1.0
 */
public class RedPacketContextFactoryTest {

    public static void main(String[] args) {

        Integer totalAmount = 10000;
        Integer totalPeopleNum = 10;

        // 线段切割算法
        RedPacketContextFactory factory = new RedPacketContextFactory(RedPacketStrategyEnum.LINE_SEGMENT_CUTTING);

        List<Integer> amountList = factory.divideRedPacketAmount(totalAmount, totalPeopleNum);

        Integer amount = 0;
        for (Integer currentAmount : amountList) {
            System.out.println("线段切割算法-->抢到金额：" + new BigDecimal(currentAmount).divide(new BigDecimal(100)));
            amount += currentAmount;
        }
        System.out.println("线段切割算法-->总金额：" + new BigDecimal(amount).divide(new BigDecimal(100)));

        // 二倍均值算法
        RedPacketContextFactory factory2 = new RedPacketContextFactory(RedPacketStrategyEnum.TWO_TIMES_MAIN_VALUE);
        List<Integer> amountList2 = factory2.divideRedPacketAmount(totalAmount, totalPeopleNum);

        Integer amount2 = 0;
        for (Integer currentAmount : amountList2) {
            amount2 += currentAmount;
            System.out.println("二倍均值算法-->抢到金额：" + new BigDecimal(currentAmount).divide(new BigDecimal(100)));
        }
        System.out.println("二倍均值算法-->总金额：" + new BigDecimal(amount2).divide(new BigDecimal(100)));


    }
}
