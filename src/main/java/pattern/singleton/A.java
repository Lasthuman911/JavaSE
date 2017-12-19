package pattern.singleton;

/**
 * final修饰的实例变量，只会实例化一次，后面保持不变，不会再重新创建新的实例，即不会再调用构造函数
 * Created by lszhen on 2017/12/19.
 */
public class A {
    public static final B b = new B();

    public static void main(String[] args) {
        B b = A.b;
        B b1= A.b;
        System.out.println(b == b1);
    }
}
