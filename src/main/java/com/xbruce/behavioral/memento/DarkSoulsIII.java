package com.xbruce.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: DarkSoulsIII
 * @Description: PS5中的一个游戏
 * @Author xbruce | xbruce121@163.com
 * @date 3/13/21 16:04 PM
 * @Version 1.0
 */
@Getter
@Setter
public class DarkSoulsIII {

    private static final String INIT_POSITION = "初始位置";
    /**
     * 当前位置
     */
    private String currentPosition = INIT_POSITION;

    /**
     * 死亡次数
     */
    private Integer timeOfDeath = 100;

    public void deadAgain() {
        System.out.println("阵亡一次～");
        this.currentPosition = INIT_POSITION;
        this.timeOfDeath += 1;
    }

    @Override
    public String toString() {
        return "DarkSoulsIII{" +
                "currentPosition='" + currentPosition + '\'' +
                ", timeOfDeath=" + timeOfDeath +
                '}';
    }
}
