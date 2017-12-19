package pattern.singleton;

/**
 * 建议使用：
 * 双重检查锁：第5种的改进区别，同步类对象-特点：线程安全，对象延迟创建
 * jdk 1.5 之后可以使用此方法：兼顾安全与效率
 * Created by lszhen on 2017/12/19.
 */
public class Singleton6 {
    /**
     * 将构造函数设置为private，不允许客户端通过new来创建此类的实例
     */
    private Singleton6() {
    }

    /**
     * 构造函数已经是private了，意味者外部不能通过构造此类对象来调用instance，所以要设置为static
     * 为了安全考虑，不允许外部直接访问类的成员变量，提供一个方法进行访问，所以设置为private
     */
    private static volatile Singleton6 instance;

    /**
     * 在运行时去判断，动态创建，假如synchronize保证同步
     * 就是在getSingleton()方法中，进行两次null检查。看似多此一举，但实际上却极大提升了并发度，进而提升了性能。
     * 为什么可以提高并发度呢？就像上文说的，在单例中new的情况非常少，绝大多数都是可以并行的读操作。
     * 因此在加锁前多进行一次null检查就可以减少绝大多数的加锁操作，执行效率提高的目的也就达到了。
     * @return
     */
    public static Singleton6 getInstance(){
        if (instance == null){
            synchronized (Singleton6.class){
                if (instance == null){
                    instance = new Singleton6();
                }
                return instance;
            }
        }
        return instance;
    }
}
