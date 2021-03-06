package com.xbruce.behavioral.strategy.concrete;

import com.xbruce.behavioral.strategy.AbstractRedPacketStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: design-patterns
 * @description: ${description}
 * @author: xbruce
 * @create: 2018-05-18 10:08
 * @Version v1.0
 */
public class TwoTimesMainValueStrategy extends AbstractRedPacketStrategy {

    /**
     * 发红包的二倍均值算法
     * totalAmount:红包总金额，金额的单位是分
     * totalPeopleNum:分红包的人数
     *
     */
    @Override
    public List<Integer> divideRedPacket(Integer totalAmount, Integer totalPeopleNum) {
        List<Integer> amountList = new ArrayList<>(totalPeopleNum);

        Integer restAmount = totalAmount;
        Integer restPeopleNum = totalPeopleNum;

        Random random = new Random();

        for (int i = 0; i < totalPeopleNum - 1; i++) {
            // 随机范围：【1，剩余人均金额的两倍),左闭右开
            int amount = random.nextInt(restAmount/restPeopleNum * 2 - 1) + 1;
            restAmount = restAmount - amount;
            restPeopleNum --;
            amountList.add(amount);
        }

        amountList.add(restAmount);

        return amountList;
    }

}
