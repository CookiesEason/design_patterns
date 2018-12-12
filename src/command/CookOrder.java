package command;

/**
 * @author CookiesEason
 * 2018/12/12 20:29
 */
public class CookOrder implements Order {

    private Root root;

    public CookOrder(Root root) {
        this.root = root;
    }

    @Override
    public void execute() {
        root.cook();
    }
}
