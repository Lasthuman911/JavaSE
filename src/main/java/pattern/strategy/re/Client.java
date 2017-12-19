package pattern.strategy.re;

/**
 * 测试
 * Created by lszhen on 2017/12/17.
 */
public class Client {
    public static void main(String[] args) {
        Duck greenDuck = new GreenHeadDuck();
        Duck redDuck = new RedHeadDuck();

        greenDuck.display();
        greenDuck.fly();
        greenDuck.quark();

        redDuck.display();
        redDuck.fly();
        redDuck.quark();
    }
}
