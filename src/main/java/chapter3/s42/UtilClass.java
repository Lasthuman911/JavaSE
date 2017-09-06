package chapter3.s42;

/**
 * 让工具类不可实例化-保证所有的访问都是通过类名
 * 1.构造函数设置为private
 * 2.终极大招：避免反射调用，在构造函数中抛异常
 * Created by zhiming.wu on 2017/9/6.
 */
public class UtilClass {
    private UtilClass() {
        throw new Error("不要实例化我");
    }
}
