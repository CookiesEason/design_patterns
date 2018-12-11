package builder.demo1;

/**
 * @author CookiesEason
 * 2018/12/11 20:55
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 15.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
