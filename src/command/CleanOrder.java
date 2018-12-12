package command;

/**
 * @author CookiesEason
 * 2018/12/12 20:29
 */
public class CleanOrder implements Order {

    private Root root;

    public CleanOrder(Root root) {
        this.root = root;
    }

    @Override
    public void execute() {
        root.clean();
    }
}
