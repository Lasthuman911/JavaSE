package pattern.singleton;

/**
 * Created by lszhen on 2017/12/19.
 */
public class Client {
    public static void main(String[] args) {
//      饿汉模式
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        if (s1 == s2){
            System.out.println(" s1 和 s2 是相同的对象");
        }else{
            System.out.println(" s1 和 s2 不是相同的对象");
        }
//      懒汉模式
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();

        if (s3 == s4){
            System.out.println(" s3 和 s4 是相同的对象");
        }else{
            System.out.println(" s3 和 s4 不是相同的对象");
        }

//        枚举模式
        Singleton8 s5 = Something.INSTANCE.getInstance();
        Singleton8 s6 = Something.INSTANCE.getInstance();

        if (s5 == s6){
            System.out.println(" s5 和 s6 是相同的对象");
        }else{
            System.out.println(" s5 和 s6 不是相同的对象");
        }
    }
}
