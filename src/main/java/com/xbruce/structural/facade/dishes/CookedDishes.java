package com.xbruce.structural.facade.dishes;

/**
 * @ClassName: CookedDishes
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 8:10 PM
 * @Version 1.0
 */
public class CookedDishes {

    private String vegetables;

    private String meat;

    private String soup;


    public CookedDishes(RawDishes rawDishes) {

        this.vegetables = rawDishes.getVegetables() + "-Cooked";
        this.meat = rawDishes.getMeat() + "-Cooked";
        this.soup = rawDishes.getSoup() + "-Cooked";
    }

    @Override
    public String toString() {
        return "CookedDishes{" +
                "vegetables='" + vegetables + '\'' +
                ", meat='" + meat + '\'' +
                ", soup='" + soup + '\'' +
                '}';
    }

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
