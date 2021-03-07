package com.xbruce.structural.bridge.engine;

/**
 * @ClassName: RaptorEngine
 * @Description: 猛禽引擎
 * @Author xbruce | xbruce121@163.com
 * @date 3/7/21 6:36 PM
 * @Version 1.0
 */
public class RaptorEngine implements EngineImplementor {

    @Override
    public void left() {
        System.out.println(this.getClass().getSimpleName() + "---left");
    }

    @Override
    public void up() {
        System.out.println(this.getClass().getSimpleName() + "---up");
    }

    @Override
    public void right() {
        System.out.println(this.getClass().getSimpleName() + "---right");
    }

    @Override
    public void down() {
        System.out.println(this.getClass().getSimpleName() + "---down");
    }
}
