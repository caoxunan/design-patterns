package com.xbruce.creational.prototype;


import com.google.common.base.Stopwatch;
import com.google.common.collect.Maps;
import com.xbruce.creational.prototype.concrete.BlackCoffee;
import com.xbruce.creational.prototype.concrete.Cappuccino;
import com.xbruce.creational.prototype.concrete.Macchiato;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: CoffeeMachine
 * @Description: 咖啡机（Client）
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 5:12 PM
 * @Version 1.0
 */
public class CoffeeMachine {

    private Map<CoffeeType, CoffeePrototype> map = Maps.newHashMap();

    {
        map.put(CoffeeType.BLACK_COFFEE, new BlackCoffee());
        map.put(CoffeeType.CAPPUCCINO, new Cappuccino());
        map.put(CoffeeType.MACCHIATO, new Macchiato());
    }

    public CoffeePrototype makeCoffee(CoffeeType coffeeType) throws CloneNotSupportedException {

        return map.get(coffeeType).clone();
    }

    /**
     * 客户端-测试
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        /**
         * 初始化咖啡机时就已经将几种可以制作的咖啡实例化一次了
         */
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        /**
         * 每一种咖啡各制作5杯
         */
        Stopwatch stopwatch = Stopwatch.createStarted();
        for (int i = 0; i < 5; i++) {

            BlackCoffee blackCoffee = (BlackCoffee) coffeeMachine.makeCoffee(CoffeeType.BLACK_COFFEE);
            System.out.println(blackCoffee);

            Cappuccino cappuccino = (Cappuccino) coffeeMachine.makeCoffee(CoffeeType.CAPPUCCINO);
            System.out.println(cappuccino);

            Macchiato macchiato = (Macchiato) coffeeMachine.makeCoffee(CoffeeType.MACCHIATO);
            System.out.println(macchiato);
        }
        System.out.println("每一种咖啡各制作5杯,总耗时：" + stopwatch.elapsed(TimeUnit.SECONDS));
    }
}
