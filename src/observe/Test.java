package observe;

/**
 * @author CookiesEason
 * 2018/12/06 12:24
 */
public class Test {

    public static void main(String[] args) {
        ThemeSubject subject = new ThemeSubject();
        Observer observer1 = new User("observer1");
        Observer observer2 = new User("observer2");

        subject.register(observer1);
        subject.register(observer2);
        subject.uploadTheme("Code");
        subject.removeObserver(observer2);
        subject.uploadTheme("Java");


    }

}
