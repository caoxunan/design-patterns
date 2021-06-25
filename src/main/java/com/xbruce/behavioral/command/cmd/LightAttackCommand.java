package com.xbruce.behavioral.command.cmd;

import com.xbruce.behavioral.command.receiver.LeftMatchstickMen;
import com.xbruce.behavioral.command.receiver.MatchstickMen;

/**
 * @ClassName: LightAttackCommand
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class LightAttackCommand implements ICommand {

    private MatchstickMen matchstickMen;

    /**
     * 指定默认命令接收者为左边的火柴人
     */
    public LightAttackCommand() {
        matchstickMen = new LeftMatchstickMen();
    }

    /**
     * 指定命令接收者
     */
    public LightAttackCommand(MatchstickMen matchstickMen) {
        this.matchstickMen = matchstickMen;
    }

    @Override
    public void execute() {
        matchstickMen.lightAttack();
    }
}
