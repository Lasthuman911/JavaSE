package pattern.strategy;

/**
 * 鸭子超类
 * Created by lszhen on 2017/12/17.
 */
public abstract class Duck {

    public Duck() {
    }

    /**

     * 公共的guagua叫方法
     */
    public void quark() {
        System.out.println("~~gugujiao~~");
    }

    public void swim() {
        System.out.println("~~swing");
    }

    /**
     * 外形显示方法，各个鸭子都不同
     */
    public abstract void display();

    public void fly(){
        System.out.println("i can fly");
    }
}
