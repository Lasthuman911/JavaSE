package chapter3.s43.Test5;

import chapter3.s43.Test5.dif.DifObject;

/**
 * 因为MyObject的clone方法继承自Test，而Test做为相对于Object的子类，是可以访问继承而来的属于它自己的受保护方法的
 * Created by zhiming.wu on 2017/9/7.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject obj = new MyObject();
        obj.clone();//OK

        DifObject difObject = new DifObject();
        difObject.clone();//Ok,虽然处于不同的包，但子类的受保护方法实际上继承自父类，父类的自己的受保护方法对自己可见
    }
}
