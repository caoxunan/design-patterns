package com.xbruce.creational.prototype.concrete;

import com.xbruce.creational.prototype.CoffeePrototype;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: Macchiato
 * @Description: 玛奇朵（咖啡的具体原型类）
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 4:56 PM
 * @Version 1.0
 */
public class Macchiato implements CoffeePrototype {

    private static final long serialVersionUID = -6365799138401412157L;

    private String item;

    public Macchiato() {
        this.item = "Special item of Macchiato.";

        try {
            // 模拟添加玛奇朵特殊佐料
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Init Macchiato coffee. Cost 3 second.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public CoffeePrototype clone() throws CloneNotSupportedException {

        Macchiato coffee = (Macchiato) super.clone();

        System.out.println("Make Macchiato ...");

        return coffee;
    }

    @Override
    public String toString() {
        return "Macchiato{" +
                "item='" + item + '\'' +
                '}';
    }
}
