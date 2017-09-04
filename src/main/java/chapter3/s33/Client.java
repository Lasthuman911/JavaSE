package chapter3.s33;

/**
 * 不要复写静态方法
 * Created by zhiming.wu on 2017/9/4.
 */
public class Client {
    public static void main(String[] args) {
        Base base = new subBase();
        base.doSomething();
        base.doAnything();//不建议使用对象去访问类方法
    }
}

class Base {
    public static void doAnything() {
        System.out.println("父类的静态方法");
    }

    public void doSomething() {
        System.out.println("父类的实例方法");
    }
}

class subBase extends Base {
    public static void doAnything() {
        System.out.println("子类的静态方法");
    }

    @Override
    public void doSomething() {
        System.out.println("子类的实例方法");
    }
}
