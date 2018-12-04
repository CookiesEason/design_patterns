package strategy;

/**
 * @author CookiesEason
 * 2018/12/04 22:36
 */
public class BlackChicken extends AbstractChicken{
    @Override
    public void crow() {
        System.out.println("BlackChicken crow");
    }

    @Override
    public void display() {
        System.out.println("BlackChicken display");
    }
}
