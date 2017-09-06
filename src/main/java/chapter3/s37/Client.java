package chapter3.s37;

/**
 * 构造代码块会想你所想
 * Created by zhiming.wu on 2017/9/4.
 */
public class Client {
    public static void main(String[] args) {
        new Base();
        new Base("ha");
        new Base(5);
        System.out.println("产生的实例的数量=" + Base.getObjectNum());
    }
}

class Base {
    private static int objectNum = 0;

    {
        objectNum++;
    }

    public Base() {

    }

    public Base(String i) {
        this();//jvm 不会把代码插入到Base中，很聪明--遇到this的情况
    }

    public Base(int i) {

    }

    public static int getObjectNum() {
        return objectNum;
    }

}
/**
 * 产生的实例的数量=3
 * ***不是4
 */