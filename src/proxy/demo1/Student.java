package proxy.demo1;

/**
 * @author CookiesEason
 * 2018/12/16 15:11
 */
public class Student implements Schedule {

    @Override
    public void task1() {
        System.out.println("task1");
    }

    @Override
    public void task2() {
        System.out.println("task2");
    }
}
