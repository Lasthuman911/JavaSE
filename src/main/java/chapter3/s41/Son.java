package chapter3.s41;

/**
 * 使用内部类实现多重继承
 * Created by zhiming.wu on 2017/9/6.
 */
public class Son extends FatherImple implements Mother {
    @Override
    public int strong() {
        return super.strong() + 1;//儿子比父亲强壮
    }

    public int kind() {
        return new MotherSpecial().kind();
    }

    /*
     *内部类可以继承一个与外部类无关的类，保证了内部类的独立性
     */
    private class MotherSpecial extends MohterImple{
        @Override
        public int kind() {
            return super.kind() - 1;//儿子的温柔指数降低了
        }
    }

}
