package pattern.strategy.re;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import pattern.strategy.re.fly.FlyBehavier;
import pattern.strategy.re.quark.QuarkBehavier;

/**
 * Created by lszhen on 2017/12/17.
 */
public abstract class Duck {
    /**
     * 面向接口编程
     */
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
}
