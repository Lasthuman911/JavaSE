package pattern.strategy.re;

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
