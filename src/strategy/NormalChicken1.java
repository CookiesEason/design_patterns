package strategy;

/**
 * @author CookiesEason
 * 2018/12/04 22:54
 */
public class NormalChicken1 extends AbstractChicken{

    private FlyWithXXX f = new FlyWithXXX();

    @Override
    public void crow() {

    }

    @Override
    public void display() {

    }

    public void fly() {
        f.fly();
    }

}
