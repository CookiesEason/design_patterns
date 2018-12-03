package singleton;

/**
 * @author CookiesEason
 * 2018/12/03 16:53
 * 线程安全的，饿汉式
 */
public class Singleton2 {

    private static Singleton2 singleton =  new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return singleton;
    }

}
