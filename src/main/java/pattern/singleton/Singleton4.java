package pattern.singleton;

/**
 * 不建议使用：
 * 饱汉模式3：和第3种没啥区别，同步类对象-特点：线程安全，对象延迟创建
 * 但是效率低，99%的情况下不需要同步
 * Created by lszhen on 2017/12/19.
 */
public class Singleton4 {
    /**
     * 将构造函数设置为private，不允许客户端通过new来创建此类的实例
     */
    private Singleton4() {
    }

    /**
     * 构造函数已经是private了，意味者外部不能通过构造此类对象来调用instance，所以要设置为static
     * 为了安全考虑，不允许外部直接访问类的成员变量，提供一个方法进行访问，所以设置为private
     */
    private static Singleton4 instance;

    /**
     * 在运行时去判断，动态创建，假如synchronize保证同步
     * @return
     */
    public static Singleton4 getInstance(){
        synchronized (Singleton4.class){
            if (instance == null){
                instance = new Singleton4();
            }
            return instance;
        }
    }
}
