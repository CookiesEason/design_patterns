package singleton;

/**
 * @author CookiesEason
 * 2018/12/03 16:59
 * 线程安全的,懒汉式,getInstance()方法相比较Singleton3,加入了双重校验,提高了性能
 */
public class Singleton4 {

    private static volatile Singleton4 singleton = null;

    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }

}
