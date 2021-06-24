package com.xbruce.behavioral.memento;

import lombok.Getter;

/**
 * @ClassName: DarkSoulsMemento
 * @Description: 可以用来保存DarkSouls3的存档信息，其中包含的状态（state）能够满足Orininator根据此状态进行restore
 * @Author xbruce | xbruce121@163.com
 * @date 3/13/21 16:04 PM
 * @Version 1.0
 */
@Getter
public class DarkSoulsMemento {

    /**
     * 当前位置
     */
    private final String currentPosition;

    /**
     * 死亡次数
     */
    private final  Integer timeOfDeath;

    public DarkSoulsMemento(String currentPosition, Integer timeOfDeath) {

        this.currentPosition = currentPosition;
        this.timeOfDeath = timeOfDeath;
    }
}
