package flyweight;

import java.util.HashMap;

/**
 * @author CookiesEason
 * 2019/01/01 22:26
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> SHAPE = new HashMap<>();

    public static Shape getShape(String name) {
        Circle circle = (Circle) SHAPE.get(name);
        if (circle == null) {
            circle = new Circle(name);
            SHAPE.put(name, circle);
            System.out.println("创建了新的shape" + name);
        }
        return circle;
    }

}
