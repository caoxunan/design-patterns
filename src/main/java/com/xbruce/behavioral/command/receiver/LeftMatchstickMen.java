package com.xbruce.behavioral.command.receiver;

/**
 * @ClassName: LeftMatchstickMen
 * @Description: The Receiver class
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class LeftMatchstickMen implements MatchstickMen {

    @Override
    public void lightAttack() {
        System.out.println("Left 左边-火柴人 进行了轻攻击");
    }

    @Override
    public void heavyAttach() {
        System.out.println("Left 左边-火柴人 进行了重攻击");
    }
}