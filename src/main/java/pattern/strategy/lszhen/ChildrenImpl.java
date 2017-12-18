package pattern.strategy.lszhen;

/**
 * Created by lszhen on 2017/12/17.
 */
public class ChildrenImpl implements FatherHuman {
    @Override
    public void eat() {
        System.out.println("用勺子吃");
    }
}
