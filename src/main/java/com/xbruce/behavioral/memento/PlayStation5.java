package com.xbruce.behavioral.memento;

import lombok.Getter;

/**
 * @ClassName: PlayStation5
 * @Description: PS5游戏机，内部有各种游戏（示例中仅包含一种）充当originator角色
 * @Author xbruce | xbruce121@163.com
 * @date 3/13/21 16:04 PM
 * @Version 1.0
 */
@Getter
public class PlayStation5 {

    private DarkSoulsIII darkSouls3 = new DarkSoulsIII();

    public DarkSoulsMemento createDarkSoulsMemento() {

        return new DarkSoulsMemento(darkSouls3.getCurrentPosition(), darkSouls3.getTimeOfDeath());
    }

    public void restoreDarkSoulsMemento(DarkSoulsMemento memento) {
        this.darkSouls3.setCurrentPosition(memento.getCurrentPosition());
        this.darkSouls3.setTimeOfDeath(memento.getTimeOfDeath());
    }
}
