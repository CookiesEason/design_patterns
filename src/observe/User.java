package observe;

/**
 * @author CookiesEason
 * 2018/12/06 12:23
 */
public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + "收到了消息" + message);
    }

}
