package bridge;

/**
 * @author CookiesEason
 * 2018/12/31 20:07
 * 使用场景:
 * 1. 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 * 2.不希望使用继承或因为多层次继承导致系统类的个数急剧增加
 * 3.抽象化角色和具体化角色之间增加更多的灵活性
 * jdbc例子
 */
public class Test {

    public static void main(String[] args) {

        AbstractShape circle = new Circle();
        circle.setColor(new White());
        circle.draw();
        circle.setColor(new Black());
        circle.draw();

    }

}
