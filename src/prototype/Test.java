package prototype;

/**
 * @author CookiesEason
 * 2018/12/14 20:07
 */
public class Test {

    public static void main(String[] args) {
        ShapeProtoType.loadCache();

        Shape clonedShape1 = ShapeProtoType.getShape(1);
        System.out.println("AbstrateShape : " + clonedShape1.getType());

        Shape clonedShape2 = ShapeProtoType.getShape(2);
        System.out.println("AbstrateShape : " + clonedShape2.getType());
        //浅拷贝下 在拷贝一个clonedShape1 发现 对对象xxx的引用还是一样的 这时候要改变这个对象xxx对这两个对象都有影响
        Shape clonedShape1copy = ShapeProtoType.getShape(1);
        System.out.println("AbstrateShape : " + clonedShape1.getXxx().hashCode());
        System.out.println("AbstrateShape : " + clonedShape1copy.getXxx().hashCode());
        //深拷贝clonedShape1 发现对象xxx是不同的
        Shape clonedDeepShape1 = ShapeProtoType.getDeepShape(1);
        System.out.println("AbstrateShape : " + clonedShape1.getXxx().hashCode());
        System.out.println("AbstrateShape : " + clonedDeepShape1.getXxx().hashCode());
    }

}
