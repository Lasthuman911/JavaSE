package pattern.strategy.re;

import pattern.strategy.re.fly.SwiftFly;
import pattern.strategy.re.quark.KukuQuark;

/**
 * Created by lszhen on 2017/12/17.
 */
public class GreenHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am green");
    }

    /**
     * 在构造方法中，初始化具体的飞行模式和叫声方式
     */
    public GreenHeadDuck() {
        flyBehavier = new SwiftFly();
        quarkBehavier = new KukuQuark();
    }
}
