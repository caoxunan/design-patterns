package com.xbruce.structural.facade.dishes;

/**
 * @ClassName: RawDishes
 * @Description: 原始菜品（由菜市场送货员提供的原材料）
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 8:04 PM
 * @Version 1.0
 */
public class RawDishes {

    private String vegetables = "蔬菜";

    private String meat = "肉";

    private String soup = "汤";

    public String getVegetables() {
        return vegetables;
    }

    public String getMeat() {
        return meat;
    }

    public String getSoup() {
        return soup;
    }
}
