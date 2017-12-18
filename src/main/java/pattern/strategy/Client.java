package pattern.strategy;

/**
 * 测试
 * Created by lszhen on 2017/12/17.
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new GreenHeadDuck();
        duck.display();
        duck.quark();
        duck.swim();

        duck.fly();

        Duck duck1 = new ReadHeadDuck();
        duck1.display();
        duck1.swim();
        duck1.quark();

        duck1.fly();
    }
}
