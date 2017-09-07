package chapter3.s43.Test6;

import chapter3.s43.Test6.subpak.MyObject;

/**
 * 不同包中子类本身的受保护方法当然不可能对父类可见
 * Created by zhiming.wu on 2017/9/7.
 */
public class Test {
    public static void main(String[] args) {
        MyObject obj = new MyObject();
//        obj.clone();//编译报错
    }
}
