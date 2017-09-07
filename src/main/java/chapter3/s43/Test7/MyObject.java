package chapter3.s43.Test7;

/**
 * 同一个包中，父类实例的clone方法在子类中依然不可见，就是因为父类的clone方法，实际上来自java.lang.Object
 * Created by zhiming.wu on 2017/9/7.
 */
public class MyObject extends Test {
    public static void main(String[] args) {
        Test test = new Test();
//        test.clone();编译报错
    }
}
