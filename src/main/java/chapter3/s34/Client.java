package chapter3.s34;

/**
 * 复杂的逻辑尽量不写在构造函数中
 * Created by zhiming.wu on 2017/9/4.
 */
public class Client {
    public static void main(String[] args) {
        Server s = new SimpleServer(1000);
    }
}

//定义一个服务
abstract class Server {
    public static final int DEFAULT_PORT = 40000;

    public Server() {
        /*int port = getPort();
        System.out.println("端口号=" + port);*/
    }

    public void start() {
        int port = getPort();
        System.out.println("端口号=" + port);
    }

    //由子类提供端口号，并提供可用性检查
    protected abstract int getPort();
}

class SimpleServer extends Server {
    private int port = 100;

    public SimpleServer(int _port) {
        port = _port;
        start();//大部分JEE服务器的实现方式
    }

    protected int getPort() {
        return Math.random() > 0.5 ? port : DEFAULT_PORT;
    }
}

