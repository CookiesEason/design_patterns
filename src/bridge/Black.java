package bridge;

/**
 * @author CookiesEason
 * 2018/12/31 20:00
 */
public class Black implements Color {

    @Override
    public void paint(String shape) {
        System.out.println("Black" + shape);
    }
}
