package com.xbruce.behavioral.state;

/**
 * @ClassName: Client
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        StateContext context = new StateContext();

        context.shot();
        context.shot();
        context.shot();
        context.shot();
        context.shot();

        context.shot();
        context.shot();
        context.shot();
        context.shot();
        context.shot();
    }
}
