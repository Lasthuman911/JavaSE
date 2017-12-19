package pattern.strategy.re.fly;

import pattern.strategy.re.fly.FlyBehavier;

/**
 * 具体的飞行模式
 * Created by lszhen on 2017/12/17.
 */
public class ButtonFly implements FlyBehavier {
    @Override
    public void fly() {
        System.out.println("fly witn Button");
    }
}
