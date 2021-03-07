package com.xbruce.structural.bridge.rocket;

import com.xbruce.structural.bridge.engine.EngineImplementor;

/**
 * @ClassName: TrafficRocket
 * @Description: 运载火箭
 * @Author xbruce | xbruce121@163.com
 * @date 3/7/21 6:52 PM
 * @Version 1.0
 */
public class TrafficRocket extends AbstractRocket {

    /**
     * 初始化时需要指定装配的引擎
     *
     * @param engineImplementor
     */
    public TrafficRocket(EngineImplementor engineImplementor) {
        super(engineImplementor);
    }

    /**
     * 运输火箭特有功能-悬停
     */
    public void hoverInTheAir() {

        System.out.println(this.getClass().getSimpleName() + " 悬停开始...");

        // 假设这样就能悬停
        engineImplementor.up();
        engineImplementor.down();

        System.out.println(this.getClass().getSimpleName() + " 利用引擎的基础能力进行了悬停!");
    }

}
