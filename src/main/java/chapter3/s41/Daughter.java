package chapter3.s41;

/**
 * 匿名内部类的写法-对比Son
 * Created by zhiming.wu on 2017/9/6.
 */
public class Daughter extends MohterImple implements Father {
    public int strong() {
        return new FatherImple(){
            @Override
            public int strong() {
                return super.strong() - 2;//女儿继承了母亲的温柔指数，复写父类的强壮指数，强壮指数减2
            }
        }.strong();
    }
}
