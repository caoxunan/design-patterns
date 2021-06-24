package com.xbruce.behavioral.memento;

/**
 * @ClassName: GamePlayer
 * @Description: 玩家(在这里充当caretaker的角色)
 * @Author xbruce | xbruce121@163.com
 * @date 3/13/21 16:04 PM
 * @Version 1.0
 */
public class GamePlayer {

    public static void main(String[] args) {

        PlayStation5 ps5 = new PlayStation5();
        DarkSoulsIII darkSouls3 = ps5.getDarkSouls3();

        System.out.println("Current State:" + darkSouls3);

        System.out.println("到达boss房前进行了存档～");

        darkSouls3.setCurrentPosition("Boss房前");

        DarkSoulsMemento darkSoulsMemento = ps5.createDarkSoulsMemento();
        System.out.println("Current State:" + darkSouls3);

        SSDDisk disk = new SSDDisk();
        disk.addDarkSoulsMemento(darkSoulsMemento);

        darkSouls3.deadAgain();
        darkSouls3.deadAgain();
        darkSouls3.deadAgain();
        System.out.println("Current State:" + darkSouls3);

        ps5.restoreDarkSoulsMemento(disk.getDarkSoulsMemento(0));
        System.out.println("覆盖了存档～");

        System.out.println("Current State:" + darkSouls3);
    }
}
