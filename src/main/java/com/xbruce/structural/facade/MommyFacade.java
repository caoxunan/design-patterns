package com.xbruce.structural.facade;

import com.xbruce.structural.facade.dishes.BeautyDishes;
import com.xbruce.structural.facade.dishes.CookedDishes;
import com.xbruce.structural.facade.dishes.RawDishes;
import com.xbruce.structural.facade.sub_system.DeliveryStaff;
import com.xbruce.structural.facade.sub_system.DishBeautician;
import com.xbruce.structural.facade.sub_system.HeadChef;

/**
 * @ClassName: MommyFacade
 * @Description: 妈妈外观类
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 7:57 PM
 * @Version 1.0
 */
public class MommyFacade {

    /**
     * 叫妈妈做晚餐
     *
     * @return 晚餐
     */
    public BeautyDishes cookDinner() {

        // 妈妈首先让送菜员送来了原材料
        RawDishes rawDishes = DeliveryStaff.getRawDishes();

        // 厨师使用原材料进行烹饪
        CookedDishes cookedDishes = HeadChef.cookInDongBeiCaiStyle(rawDishes);

        // 美盘师进行美盘
        BeautyDishes beautyDishes = DishBeautician.beautyCookedDishes(cookedDishes);
        return beautyDishes;
    }
}
