package com.xbruce.structural.bridge.engine;

/**
 * @ClassName: AngelHunterEngine
 * @Description: 猎鹰引擎
 * @Author xbruce | xbruce121@163.com
 * @date 3/7/21 6:35 PM
 * @Version 1.0
 */
public class AngelHunterEngine implements EngineImplementor {

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
