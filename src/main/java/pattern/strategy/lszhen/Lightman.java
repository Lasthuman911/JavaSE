package pattern.strategy.lszhen;

/**
 * Created by lszhen on 2017/12/17.
 */
public class Lightman {
    private FatherHuman fatherHuman;
    public Lightman(FatherHuman fatherHuman){
        this.fatherHuman = fatherHuman;
    }

    public static void main(String[] args) {
        Lightman lightman = new Lightman(new ChildrenImpl());
        lightman.fatherHuman.eat();
    }
}
