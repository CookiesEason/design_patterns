package observe;

import java.util.Observable;
import java.util.Observer;

/**
 * @author CookiesEason
 * 2018/12/06 21:47
 */
public class OtherUser implements Observer {

    private String name;

    public OtherUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "--->" + arg);
    }

}
