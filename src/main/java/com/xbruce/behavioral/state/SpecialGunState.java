package com.xbruce.behavioral.state;

/**
 * @ClassName: SpecialGunState
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class SpecialGunState implements State {

    // 子弹的个数
    private int bullets;

    public SpecialGunState(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public void shot(StateContext context) {

        // 弹药充足就继续使用该弹药
        if (bullets > 0) {
            bullets -= 1;
            System.out.println("突、突、突！");

            if (bullets == 0) {
                // 切换至普通枪械
                System.out.println("切换普通枪械A～！");
                context.setState(new DefaultGunState());
            }
        }
    }
}
