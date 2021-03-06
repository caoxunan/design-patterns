package com.xbruce.structural.facade;

import com.xbruce.structural.facade.dishes.BeautyDishes;

/**
 * @ClassName: ChildClient
 * @Description: 小孩（客户端）
 * @Author xbruce | xbruce121@163.com
 * @date 3/6/21 7:58 PM
 * @Version 1.0
 */
public class ChildClient {

    public static void main(String[] args) {

        MommyFacade mom = new MommyFacade();

        BeautyDishes beautyDishes = mom.cookDinner();

        System.out.println(beautyDishes);
    }
}
