package com.xbruce.behavioral.command.invoker;

import com.xbruce.behavioral.command.cmd.ICommand;

/**
 * @ClassName: Invoker
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class Invoker {

    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    /**
     * 发起攻击
     */
    public void pressAttachButton() {

        command.execute();
    }
}
