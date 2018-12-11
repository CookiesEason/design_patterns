package builder.demo1;

/**
 * @author CookiesEason
 * 2018/12/11 20:55
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
