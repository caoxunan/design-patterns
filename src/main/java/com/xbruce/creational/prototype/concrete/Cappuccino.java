package com.xbruce.creational.prototype.concrete;

import com.xbruce.creational.prototype.CoffeePrototype;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: Cappuccino
 * @Description: 卡布奇诺（咖啡的具体原型类）
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 4:56 PM
 * @Version 1.0
 */
public class Cappuccino implements CoffeePrototype {

    private static final long serialVersionUID = -6365799138401412157L;

    private String item;

    public Cappuccino() {
        this.item = "Special item of Cappuccino.";

        try {
            // 模拟添加卡布奇诺特殊佐料
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Init Cappuccino coffee.Cost 2 seconds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public CoffeePrototype clone() throws CloneNotSupportedException {

        Cappuccino coffee = (Cappuccino) super.clone();

        System.out.println("Make Cappuccino ...");

        return coffee;
    }

    @Override
    public String toString() {
        return "Cappuccino{" +
                "item='" + item + '\'' +
                '}';
    }
}
