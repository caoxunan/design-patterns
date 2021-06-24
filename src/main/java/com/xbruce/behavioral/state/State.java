package com.xbruce.behavioral.state;

/**
 * @ClassName: State
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public interface State {

    /**
     * 射击
     */
    void shot(StateContext context);
}
