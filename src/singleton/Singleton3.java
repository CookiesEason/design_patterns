package singleton;

/**
 * @author CookiesEason
 * 2018/12/03 16:57
 * 线程安全的,懒汉式,getInstance()方法加入了锁,但是效率低
 */
public class Singleton3 {

    private static Singleton3 singleton = null;

    private Singleton3() {}

    public static synchronized Singleton3 getInstance() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }

}
