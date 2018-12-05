package strategy;

/**
 * @author CookiesEason
 * 2018/12/04 22:32
 */
public abstract class AbstractChicken {

    private FlyBehave flyBehave;

    /**
     * 设置一个默认动作
     */
    public AbstractChicken() {
        flyBehave = new FlyWithXXX();
    }

    public abstract void crow();

    public abstract void display();

    public void strategyFly() {
        flyBehave.fly();
    }


    public void setFlyBehave(FlyBehave flyBehave) {
        this.flyBehave = flyBehave;
    }

}
