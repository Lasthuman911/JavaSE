package chapter3.s31;

/**
 * 在接口中可以有实现，但应避免使用
 * Created by zhiming.wu on 2017/9/4.
 */
public class Client {
    public static void main(String[] args) {
        B.s.doSomething();
    }
}

interface B{
    public static final S s = new S(){
        public void doSomething() {
            System.out.println("我在接口中实现了");
        }
    };
}

interface S{
    public void doSomething();
}
