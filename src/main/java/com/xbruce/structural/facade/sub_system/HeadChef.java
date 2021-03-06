package com.xbruce.structural.facade.sub_system;

import com.xbruce.structural.facade.dishes.CookedDishes;
import com.xbruce.structural.facade.dishes.RawDishes;

/**
 * @ClassName: HeadChef
 * @Description: 厨师长
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 7:59 PM
 * @Version 1.0
 */
public class HeadChef {

    /**
     * 厨师做了一顿东北菜
     *
     * @param rawDishes 原材料
     * @return 做好的菜品
     */
    public static CookedDishes cookInDongBeiCaiStyle(RawDishes rawDishes) {

        System.out.println("厨师长做了一顿东北菜!");
        return new CookedDishes(rawDishes);
    }
}
