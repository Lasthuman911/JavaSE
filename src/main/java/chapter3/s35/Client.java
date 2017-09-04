package chapter3.s35;

/**
 * Created by zhiming.wu on 2017/9/4.
 */
public class Client {
    public static void main(String[] args) {
        Son s = new Son();
    }
}

class Father {
    public Father() {
        new other();
    }
}

class Son extends Father {
    public void doSomething() {
        System.out.println("hahaha");
    }
}

class other {
    public other() {
        new Son();
    }
}