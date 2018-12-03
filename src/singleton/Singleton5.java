package singleton;

/**
 * @author CookiesEason
 * 2018/12/03 17:02
 * 线程安全的,相比较Singleton2实现了懒加载
 */
public class Singleton5 {

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {}

    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
