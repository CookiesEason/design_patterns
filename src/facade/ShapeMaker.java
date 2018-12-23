package facade;

/**
 * @author CookiesEason
 * 2018/12/23 20:21
 */
public class ShapeMaker {

    private Circle circle;

    private Rectangle rectangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void circle() {
        circle.shape();
    }

    public void rectangle() {
        rectangle.shape();
    }

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.rectangle();
        shapeMaker.circle();
    }

}
