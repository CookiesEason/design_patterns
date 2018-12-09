package factory;

/**
 * @author CookiesEason
 * 2018/12/09 15:07
 */
public class ShapeFactory {

    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
