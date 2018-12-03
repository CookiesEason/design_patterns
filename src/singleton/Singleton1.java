package singleton;

/**
 * @author CookiesEason
 * 2018/12/03 16:31
 * 线程不安全的，懒汉式
 */
public class Singleton1 {


    private static Singleton1 singleton = null;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }
}
