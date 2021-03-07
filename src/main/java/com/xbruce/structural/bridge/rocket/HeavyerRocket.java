package com.xbruce.structural.bridge.rocket;

import com.xbruce.structural.bridge.engine.EngineImplementor;

/**
 * @ClassName: HeavyerRocket
 * @Description: 重型火箭
 * @Author xbruce | xbruce121@163.com
 * @date 3/7/21 6:29 PM
 * @Version 1.0
 */
public class HeavyerRocket extends AbstractRocket {

    /**
     * 初始化时需要指定装配的引擎
     *
     * @param engineImplementor 发动机引擎
     */
    public HeavyerRocket(EngineImplementor engineImplementor) {
        super(engineImplementor);
    }

    /**
     * 重型火箭的特有能力（加速飞行）
     */
    public void speedUpFlying() {
        System.out.println(this.getClass().getSimpleName() + " 加速飞行开始...");
        engineImplementor.up();
        engineImplementor.up();
        engineImplementor.up();
        engineImplementor.up();
        System.out.println(this.getClass().getSimpleName() + " 利用引擎的基础能力进行了加速飞行!");

    }

}
