package com.xbruce.structural.facade.sub_system;

import com.xbruce.structural.facade.dishes.RawDishes;

/**
 * @ClassName: DeliveryStaff
 * @Description: 配送人员
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 8:01 PM
 * @Version 1.0
 */
public class DeliveryStaff {

    /**
     * 配送人员送菜
     */
    public static RawDishes getRawDishes() {

        System.out.println("配送人员送来了菜!");
        return new RawDishes();
    }
}
