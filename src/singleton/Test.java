package singleton;

/**
 * @author CookiesEason
 * 2018/12/03 16:33
 */
public class Test extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "," + Singleton1.getInstance().toString());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Test().start();
        }
        System.out.println(Thread.currentThread().getName() + "," + Singleton1.getInstance().toString());
    }

}
