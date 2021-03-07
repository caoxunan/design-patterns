package com.xbruce.structural.bridge.engine;

/**
 * @ClassName: EngineImplementor
 * @Description: 引擎实现接口
 * @Author xbruce | xbruce121@163.com
 * @date 3/7/21 6:17 PM
 * @Version 1.0
 */
public interface EngineImplementor {

    /**
     * 向左
     */
    void left();

    /**
     * 点火向上
     * 咱也不懂火箭，我们假设火箭向上就代表起飞哈，求生欲拉满
     */
    void up();

    /**
     * 向右
     */
    void right();

    /**
     * 向下
     */
    void down();
}
