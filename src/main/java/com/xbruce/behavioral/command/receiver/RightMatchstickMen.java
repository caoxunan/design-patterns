package com.xbruce.behavioral.command.receiver;

/**
 * @ClassName: RightMatchstickMen
 * @Description: The Receiver class
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class RightMatchstickMen implements MatchstickMen {

    @Override
    public void lightAttack() {
        System.out.println("Right 右边-火柴人 进行了轻攻击");
    }

    @Override
    public void heavyAttach() {
        System.out.println("Right 右边-火柴人 进行了重攻击");
    }
}