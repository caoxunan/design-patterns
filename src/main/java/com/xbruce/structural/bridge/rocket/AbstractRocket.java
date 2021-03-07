package com.xbruce.structural.bridge.rocket;

import com.xbruce.structural.bridge.engine.EngineImplementor;

/**
 * @ClassName: AbstractRocket
 * @Description: 抽象火箭 (定义火箭具有的通用能力)
 * @Author xbruce | xbruce121@163.com
 * @date 3/7/21 6:14 PM
 * @Version 1.0
 */
public abstract class AbstractRocket {

    protected EngineImplementor engineImplementor;

    /**
     * 初始化时需要指定装配的引擎
     */
    public AbstractRocket(EngineImplementor engineImplementor) {

        System.out.println(String.format("[%s] 火箭装配了 [%s] 发动机!", this.getClass().getSimpleName(), engineImplementor.getClass().getSimpleName()));

        this.engineImplementor = engineImplementor;
    }

    /**
     * 点火起飞
     */
    public void fire() {
        System.out.println(this.getClass().getSimpleName() + " 点火开始...");
        engineImplementor.up();
        System.out.println(this.getClass().getSimpleName() + " 点火起飞完成!");
    }

    /**
     * 降落
     */
    public void landing() {

        System.out.println(this.getClass().getSimpleName() + " 火箭降落开始...");
        engineImplementor.down();
        System.out.println(this.getClass().getSimpleName() + " 火箭降落完成!");
    }
}
