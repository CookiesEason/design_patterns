package observe;

/**
 * @author CookiesEason
 * 2018/12/06 12:24
 */
public class Test {

    public static void main(String[] args) {
        // 自己实现的观察者模式
        ThemeSubject subject = new ThemeSubject();
        Observer observer1 = new User("observer1");
        Observer observer2 = new User("observer2");

        subject.register(observer1);
        subject.register(observer2);
        subject.uploadTheme("Code");
        subject.removeObserver(observer2);
        subject.uploadTheme("Java");

        //java自带的观察者模式
        OtherSubject otherSubject = new OtherSubject();
        java.util.Observer observer3 = new OtherUser("observer3");
        java.util.Observer observer4 = new OtherUser("observer4");
        otherSubject.addObserver(observer3);
        otherSubject.addObserver(observer4);
        otherSubject.setChanged();
        otherSubject.notifyObservers("java主题");
        otherSubject.deleteObserver(observer3);
        otherSubject.setChanged();
        otherSubject.notifyObservers("Code主题");
    }

}
