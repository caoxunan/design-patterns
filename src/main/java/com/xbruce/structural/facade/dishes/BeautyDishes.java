package com.xbruce.structural.facade.dishes;

/**
 * @ClassName: BeautyDishes
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 8:17 PM
 * @Version 1.0
 */
public class BeautyDishes {

    private String vegetables;

    private String meat;

    private String soup;

    public BeautyDishes(CookedDishes cookedDishes) {

        this.vegetables = cookedDishes.getVegetables() + "-Beauty!";
        this.meat = cookedDishes.getMeat() + "-Beauty!";
        this.soup = cookedDishes.getSoup() + "-Beauty!";
    }

    @Override
    public String toString() {
        return "BeautyDishes{" +
                "vegetables='" + vegetables + '\'' +
                ", meat='" + meat + '\'' +
                ", soup='" + soup + '\'' +
                '}';
    }
}
