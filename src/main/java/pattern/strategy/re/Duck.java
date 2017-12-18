package pattern.strategy.re;

/**
 * Created by lszhen on 2017/12/17.
 */
public abstract class Duck {
    public QuarkBehavier getQuarkBehavier() {
        return quarkBehavier;
    }

    public void setQuarkBehavier(QuarkBehavier quarkBehavier) {
        this.quarkBehavier = quarkBehavier;
    }

    public FlyBehavier getFlyBehavier() {
        return flyBehavier;
    }

    public void setFlyBehavier(FlyBehavier flyBehavier) {
        this.flyBehavier = flyBehavier;
    }

    public QuarkBehavier quarkBehavier;
    public FlyBehavier flyBehavier;

    public Duck() {
    }

    public abstract void display();

    public void quark(){
        quarkBehavier.quark();
    }

    public void fly(){
        flyBehavier.fly();
    }
}
