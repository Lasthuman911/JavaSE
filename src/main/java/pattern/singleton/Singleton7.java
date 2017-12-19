package pattern.singleton;

/**
 * 建议使用：
 * 静态内部类写法：兼顾安全与效率
 * Created by lszhen on 2017/12/19.
 */
public class Singleton7 {
    /**
     * 将构造函数设置为private，不允许客户端通过new来创建此类的实例
     */
    private Singleton7() {
    }

    private static class Holder{
        public static Singleton7 instance  = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return Holder.instance;
    }
}
