package builder.demo1;

/**
 * @author CookiesEason
 * 2018/12/11 20:53
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }


}
