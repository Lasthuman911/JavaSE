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

    public RedHeadDuck() {
        flyBehavier = new ButtonFly();
        quarkBehavier = new GuguQuark();
    }
}
