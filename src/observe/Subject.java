package observe;

/**
 * @author CookiesEason
 * 2018/12/06 12:17
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void register(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
