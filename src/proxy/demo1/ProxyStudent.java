package proxy.demo1;

/**
 * @author CookiesEason
 * 2018/12/16 15:15
 */
public class ProxyStudent implements Schedule {

    private Schedule schedule;

    public ProxyStudent(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public void task1() {
        System.out.println("task1 together");
        schedule.task1();
    }

    @Override
    public void task2() {
        System.out.println("task2 together");
        schedule.task1();
    }
}
