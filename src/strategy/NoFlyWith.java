package strategy;

/**
 * @author CookiesEason
 * 2018/12/05 15:13
 */
public class NoFlyWith implements FlyBehave {
    @Override
    public void fly() {
        System.out.println("no fly with");
    }
}
