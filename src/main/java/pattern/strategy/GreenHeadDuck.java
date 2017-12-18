package pattern.strategy;

/**
 * 绿头鸭
 * Created by lszhen on 2017/12/17.
 */
public class GreenHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am greenHead");
    }

    @Override
    public void fly(){
        System.out.println("i can't fly");
    }
}
