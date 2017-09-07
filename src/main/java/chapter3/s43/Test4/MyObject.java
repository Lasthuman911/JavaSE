package chapter3.s43.Test4;

/**
 * super关键字对于基类受保护成员的调用是个语言设计之中的“例外”
 * Created by zhiming.wu on 2017/9/7.
 */
public class MyObject {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
