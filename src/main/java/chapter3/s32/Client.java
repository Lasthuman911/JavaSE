package chapter3.s32;

/**
 * 变量先声明后赋值-特别是静态变量
 * Created by zhiming.wu on 2017/9/4.
 */
public class Client {
    private static int i = 1;

    static {
        i = 100;
    }

    public static void main(String[] args) {
        System.out.println("i = " + i);
    }
}
