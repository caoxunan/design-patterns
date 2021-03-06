package com.xbruce.creational.prototype;

import java.io.Serializable;

/**
 * @ClassName: CoffeePrototype
 * @Description: 原型咖啡类（可以定义为接口，也可以定义为类）
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 4:44 PM
 * @Version 1.0
 */
public interface CoffeePrototype extends Cloneable, Serializable {

    CoffeePrototype clone() throws CloneNotSupportedException;
}
