package com.cxn.behavioral.strategy.concrete;

import com.cxn.behavioral.strategy.AbstractRedPacketStrategy;

import java.util.*;

/**
 * @program: design-patterns
 * @description: ${description}
 * @author: cxn
 * @create: 2018-05-18 10:10
 * @Version v1.0
 */
public class LineSegmentCuttingStrategy extends AbstractRedPacketStrategy {

    /**
     * 发红包的线段切割算法
     * totalAmount:红包总金额，金额的单位是分
     * totalPeopleNum:分红包的人数
     *
     */
    @Override
    public List<Integer> divideRedPacket(Integer totalAmount, Integer totalPeopleNum) {

        // 定义一个集合准备存放分好的金额
        List<Integer> amountList = new ArrayList<>(totalPeopleNum);

        // 定义一个set集合存放切割线段
        Set<Integer> cutLine = new TreeSet<>();

        Random random = new Random();

        // 存放totalPeopleNum - 1个切割点
        while (cutLine.size() < totalPeopleNum - 1) {
            // random 左闭右开-->[0,总金额-1分）+1 就变成了-->[1分,总金额）
            int randomAmount = random.nextInt(totalAmount - 1) + 1;
            cutLine.add(randomAmount);
        }

        // 根据切割点来计算随机金额
        Integer preAmount = 0;
        Integer restAmount = totalAmount;
        for (Integer cutAmount : cutLine) {

            int currentAmount = cutAmount - preAmount;
            restAmount -= currentAmount;
            preAmount = cutAmount;

            amountList.add(currentAmount);
        }
        // 最后一次获得所有剩余的金额，保证总金额相等
        amountList.add(restAmount);

        return amountList;
    }

}
