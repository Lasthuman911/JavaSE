package chapter3.s43.test3;

/**
 * 虽然MyObject与Test属于同一个包，但受保护的clone方法来自java.lang.Object类型，相当于调用的是基类的clone方法
 * 而在Test中，其（Test）基类Object的受保护方法是不可见的。--因为和Object不在同一个包下
 * Created by zhiming.wu on 2017/9/6.
 */
class MyObject {
}

public class Test {
    public static void main(String[] args) {
        MyObject object = new MyObject();
//        object.clone();//编译报错
        Object obj = new Object();
//        obj.clone();//编译报错
    }
}
