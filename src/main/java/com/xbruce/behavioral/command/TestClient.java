package com.xbruce.behavioral.command;

import com.xbruce.behavioral.command.cmd.HeavyAttackCommand;
import com.xbruce.behavioral.command.cmd.LightAttackCommand;
import com.xbruce.behavioral.command.invoker.Invoker;
import com.xbruce.behavioral.command.receiver.RightMatchstickMen;

/**
 * @ClassName: TestClient
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class TestClient {

    public static void main(String[] args) {

        // 命令调用者
        Invoker invoker = new Invoker();

        // 具体命令（不指定命令接受者，使用默认命令接收者）
        LightAttackCommand lightAttackCommand = new LightAttackCommand();
        HeavyAttackCommand heavyAttackCommand = new HeavyAttackCommand();

        invoker.setCommand(lightAttackCommand);
        invoker.pressAttachButton();

        invoker.setCommand(heavyAttackCommand);
        invoker.pressAttachButton();

        // 指定命令接收者（右边的火柴人）执行命令
        LightAttackCommand command3 = new LightAttackCommand(new RightMatchstickMen());
        HeavyAttackCommand command4 = new HeavyAttackCommand(new RightMatchstickMen());

        invoker.setCommand(command3);
        invoker.pressAttachButton();

        invoker.setCommand(command4);
        invoker.pressAttachButton();
    }
}
