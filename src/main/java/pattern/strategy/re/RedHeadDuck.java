package pattern.strategy.re;

import pattern.strategy.re.fly.ButtonFly;
import pattern.strategy.re.quark.GuguQuark;

/**
 * Created by lszhen on 2017/12/17.
 */
public class RedHeadDuck extends Duck{
    @Override
    public void display() {
        System.out.println(" i am red Head");
    }

    /**
     * 在构造方法中，初始化具体的飞行模式和叫声方式
     */
    public RedHeadDuck() {
        flyBehavier = new ButtonFly();
        quarkBehavier = new GuguQuark();
    }
}
