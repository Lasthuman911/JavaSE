package pattern.singleton;

/**
 * 不建议使用：
 * 饱汉模式-特点：线程不安全，对象延迟创建
 * Created by lszhen on 2017/12/19.
 */
public class Singleton2 {
    /**
     * 将构造函数设置为private，不允许客户端通过new来创建此类的实例
     */
    private Singleton2() {
    }

    /**
     * 构造函数已经是private了，意味者外部不能通过构造此类对象来调用instance，所以要设置为static
     * 为了安全考虑，不允许外部直接访问类的成员变量，提供一个方法进行访问，所以设置为private
     */
    private static Singleton2 instance;

    /**
     * 在运行时去判断，动态创建，在多线程环境，可能会产生多个实例，所以是线程不安全的
     * @return
     */
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
