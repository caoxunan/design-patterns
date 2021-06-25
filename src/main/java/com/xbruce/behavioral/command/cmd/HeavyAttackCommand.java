package com.xbruce.behavioral.command.cmd;

import com.xbruce.behavioral.command.receiver.LeftMatchstickMen;
import com.xbruce.behavioral.command.receiver.MatchstickMen;

/**
 * @ClassName: HeavyAttackCommand
 * @Description:
 * @Author xbruce | xbruce121@163.com
 * @Version 1.0
 */
public class HeavyAttackCommand implements ICommand {

    private MatchstickMen matchstickMen;

    /**
     * 指定默认命令接收者为左边的火柴人
     */
    public HeavyAttackCommand() {
        matchstickMen = new LeftMatchstickMen();
    }

    /**
     * 指定命令接收者
     */
    public HeavyAttackCommand(MatchstickMen matchstickMen) {
        this.matchstickMen = matchstickMen;
    }

    @Override
    public void execute() {
        matchstickMen.heavyAttach();
    }
}