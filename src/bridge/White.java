package bridge;

/**
 * @author CookiesEason
 * 2018/12/31 20:00
 */
public class White implements Color {

    @Override
    public void paint(String shape) {
        System.out.println("White" + shape);
    }
}
