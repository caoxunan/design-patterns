package com.xbruce.creational.prototype.concrete;

import com.xbruce.creational.prototype.CoffeePrototype;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: BlackCoffee
 * @Description: 黑咖啡
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 4:48 PM
 * @Version 1.0
 */
public class BlackCoffee implements CoffeePrototype {

    private static final long serialVersionUID = -8316875130992970641L;

    private String item;

    public BlackCoffee() {

        this.item = "Special item of Black Coffee.";

        try {
            // 模拟添加黑咖啡特殊佐料
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Init Black coffee.Cost 1 seconds.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public CoffeePrototype clone() throws CloneNotSupportedException {

        BlackCoffee coffee = (BlackCoffee) super.clone();

        System.out.println("Make BlackCoffee ...");

        return coffee;
    }

    @Override
    public String toString() {
        return "BlackCoffee{" +
                "item='" + item + '\'' +
                '}';
    }
}
