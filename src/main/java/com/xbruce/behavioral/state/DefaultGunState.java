package com.xbruce.behavioral.state;

/**
 * @ClassName: DefaultGunState
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class DefaultGunState implements State {

    private int times;

    @Override
    public void shot(StateContext context) {

        System.out.println("哒、哒、哒！");
        times += 1;

        // 普通枪械A射击5次后，自动切换至特殊枪械B
        if (3 == times) {
            System.out.println("切换特种枪械B～！");
            context.setState(new SpecialGunState(2));
            times = 0;
        }
    }
}
