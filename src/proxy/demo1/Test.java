package proxy.demo1;

/**
 * @author CookiesEason
 * 2018/12/16 15:17
 */
public class Test {

    public static void main(String[] args) {
        ProxyStudent proxyStudent = new ProxyStudent(new Student());
        proxyStudent.task1();
        proxyStudent.task2();
    }

}
