package com.xbruce.structural.facade.sub_system;

import com.xbruce.structural.facade.dishes.BeautyDishes;
import com.xbruce.structural.facade.dishes.CookedDishes;

/**
 * @ClassName: DishBeautician
 * @Description: 美盘师
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 8:02 PM
 * @Version 1.0
 */
public class DishBeautician {

    /**
     * 美盘师 对厨师做好的食物进行了美盘
     * @param cookedDishes 做好的菜品
     * @return 进行了美盘后的菜品
     */
    public static BeautyDishes beautyCookedDishes(CookedDishes cookedDishes) {

        System.out.println("美盘师对食物进行了美盘!");
        return new BeautyDishes(cookedDishes);
    }
}
