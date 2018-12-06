package observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CookiesEason
 * 2018/12/06 12:20
 */
public class ThemeSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String message;

    @Override
    public void register(Observer observer) {
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void uploadTheme(String message) {
        this.message = message;
        System.out.println("发布了新的主题" + message);
        notifyObserver();
    }
}
