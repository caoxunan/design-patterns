package com.xbruce.behavioral.state;

/**
 * @ClassName: StateContext
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class StateContext {

    private State state;

    /**
     * 指定默认状态为使用普通枪械
     */
    public StateContext() {
        this.state = new DefaultGunState();
    }

    /**
     * 用来切换状态
     *
     * @param newState newState
     */
    public void setState(State newState) {
        this.state = newState;
    }

    /**
     * 射击
     */
    public void shot() {
        state.shot(this);
    }
}
