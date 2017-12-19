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

    public GreenHeadDuck() {
        flyBehavier = new SwiftFly();
        quarkBehavier = new KukuQuark();
    }
}
