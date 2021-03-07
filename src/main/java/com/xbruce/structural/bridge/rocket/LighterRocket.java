package com.xbruce.structural.bridge.rocket;

import com.xbruce.structural.bridge.engine.EngineImplementor;

/**
 * @ClassName: LighterRocket
 * @Description: 轻型火箭
 * @Author xbruce | xbruce121@163.com
 * @date 3/7/21 6:24 PM
 * @Version 1.0
 */
public class LighterRocket extends AbstractRocket {

    /**
     * 初始化时需要指定装配的引擎
     *
     * @param engineImplementor 发动机引擎
     */
    public LighterRocket(EngineImplementor engineImplementor) {
        super(engineImplementor);
    }

    /**
     * 轻型火箭特有功能转圈圈
     */
    public void goingRoundInCircle() {

        System.out.println(this.getClass().getSimpleName() + " 转圈圈开始...");
        // 我们就假设利用引擎的不同推力方向就能实现转圈圈
        engineImplementor.left();
        engineImplementor.up();
        engineImplementor.right();
        engineImplementor.down();
        System.out.println(this.getClass().getSimpleName() + " 利用引擎的基础能力进行了转圈圈!");
    }
}
