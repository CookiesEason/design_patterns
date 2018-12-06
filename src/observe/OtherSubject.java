package observe;

import java.util.Observable;
import java.util.Observer;

/**
 * @author CookiesEason
 * 2018/12/06 21:43
 * java内置的观察者模式，采用了继承的方式
 */
public class OtherSubject extends Observable {

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

}
