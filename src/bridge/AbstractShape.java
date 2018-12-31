package bridge;

/**
 * @author CookiesEason
 * 2018/12/31 19:58
 */
public abstract class AbstractShape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
