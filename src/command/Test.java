package command;

/**
 * @author CookiesEason
 * 2018/12/12 20:33'
 * 优点：1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。
 * 缺点：显而易见如果一个类的命令过多会导致  “具体命令类”  个数非常膨胀
 */
public class Test {

    public static void main(String[] args) {
        Root root = new Root();
        CookOrder cookOrder = new CookOrder(root);
        CleanOrder cleanOrder = new CleanOrder(root);
        Command command = new Command();
        command.addOrder(cleanOrder);
        command.addOrder(cookOrder);
        command.placeOrders();
    }
}
