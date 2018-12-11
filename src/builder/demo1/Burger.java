package builder.demo1;

/**
 * @author CookiesEason
 * 2018/12/11 20:52
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }


}
