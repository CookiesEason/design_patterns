package command;



import java.util.ArrayList;
import java.util.List;

/**
 * @author CookiesEason
 * 2018/12/12 20:31
 */
public class Command {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }


}
