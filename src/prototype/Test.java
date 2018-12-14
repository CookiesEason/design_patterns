package prototype;

/**
 * @author CookiesEason
 * 2018/12/14 20:07
 */
public class Test {

    public static void main(String[] args) {
        ShapeProtoType.loadCache();

        Shape clonedShape1 = ShapeProtoType.getShape(1);
        System.out.println("Shape : " + clonedShape1.getType());

        Shape clonedShape2 = ShapeProtoType.getShape(2);
        System.out.println("Shape : " + clonedShape2.getType());

    }

}
