package prototype;

import java.util.HashMap;

/**
 * @author CookiesEason
 * 2018/12/14 20:03
 */
public class ShapeProtoType {

    private static HashMap<Integer, Shape> shapeTable = new HashMap<>();

    public static Shape getShape(Integer shapeId) {
        Shape cacheShape = shapeTable.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        shapeTable.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(2);
        shapeTable.put(rectangle.getId(),rectangle);
    }

}
