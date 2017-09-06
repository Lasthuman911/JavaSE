package chapter3.s39;

import java.util.ArrayList;
import java.util.List;

/**
 * 匿名类的构造函数
 * Created by zhiming.wu on 2017/9/4.
 */
public class Client {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        //匿名类的声明和赋值
        List a2 = new ArrayList(){};
        //里面的括号是匿名类的构造函数（初始化块就是它的构造函数）
        List a3 = new ArrayList(){{}};

        System.out.println(a1.getClass() == a2.getClass());
        System.out.println(a1.getClass() == a3.getClass());
        System.out.println(a2.getClass() == a3.getClass());
    }
}
/**
 * false
   false
   false
 */
