package com.xbruce.structural.bridge;

import com.xbruce.structural.bridge.engine.AngelHunterEngine;
import com.xbruce.structural.bridge.engine.NuclearPowerEngine;
import com.xbruce.structural.bridge.engine.RaptorEngine;
import com.xbruce.structural.bridge.rocket.HeavyerRocket;
import com.xbruce.structural.bridge.rocket.LighterRocket;
import com.xbruce.structural.bridge.rocket.TrafficRocket;

/**
 * @ClassName: RocketControlClient
 * @Description: 火箭控制客户端
 * @Author xbruce | xbruce121@163.com
 * @date 3/7/21 6:38 PM
 * @Version 1.0
 */
public class RocketControlClient {

    public static void main(String[] args) {

        AngelHunterEngine angelHunterEngine = new AngelHunterEngine();
        HeavyerRocket heavyerRocket = new HeavyerRocket(angelHunterEngine);

        // 点火
        heavyerRocket.fire();
        // 加速飞行
        heavyerRocket.speedUpFlying();
        // 降落
        heavyerRocket.landing();

        System.out.println("---------------------------------------");

        RaptorEngine raptorEngine = new RaptorEngine();
        LighterRocket lighterRocket = new LighterRocket(raptorEngine);
        // 点火
        lighterRocket.fire();
        // 转圈圈
        lighterRocket.goingRoundInCircle();
        // 降落
        lighterRocket.landing();

        System.out.println("---------------------------------------");

        NuclearPowerEngine nuclearPowerEngine = new NuclearPowerEngine();
        TrafficRocket trafficRocket = new TrafficRocket(nuclearPowerEngine);
        // 点火
        trafficRocket.fire();
        // 悬停
        trafficRocket.hoverInTheAir();
        // 降落
        trafficRocket.landing();
    }
}