package chapter3.s43.Test4;

/**
 * 同一个包中protected相当于public
 * Created by zhiming.wu on 2017/9/7.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject obj = new MyObject();
        obj.clone();
    }
}
