package flyweight;

/**
 * @author CookiesEason
 * 2019/01/01 22:29
 * 使用场景： 1、系统有大量相似对象。 2、需要缓冲池的场景。
 * 数据库的数据池！！！
 * 优点:大大减少对象的创建，降低系统的内存，使效率提高。
 * 缺点:提高了系统的复杂度，
 * 需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。
 */
public class Test {

    private static final String [] NAMES =
            { "1", "2", "3", "4", "5" };

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getShape(getRandomName());
            circle.draw();
        }
    }

    private static String getRandomName() {
        return NAMES[(int)(Math.random()* NAMES.length)];
    }

}
