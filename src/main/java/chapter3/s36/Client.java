package chapter3.s36;

/**
 * 构造代码块相当于在每个构造函数的公用开头代码
 * Created by zhiming.wu on 2017/9/4.
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        Client client1 = new Client(5);
    }

    {
        System.out.println("在构造函数开头执行");
    }

    public Client() {
        // System.out.println("在构造函数开头执行");
        System.out.println("123");
    }

    public Client(int i) {
        // System.out.println("在构造函数开头执行");
        System.out.println("i=" + i);
    }
}
