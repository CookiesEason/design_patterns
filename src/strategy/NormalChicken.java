package strategy;

/**
 * @author CookiesEason
 * 2018/12/04 22:41
 * 如果这只chicken相比较BlackChicken会飞,需要在抽象类内加入fly动作
 * 这样做会使BlackChicken类产生不必要的代码,所以要改进继承,将fly动作声明为一个接口
 * 重点：由于接口的方法没有实现的功能,所以达不到代码复用的效果例如 当多个种类的chicken实现相同的fly行
 * 那这样代码就显得很重复，并且容易造成错误。
 * 解决方法：设计原则:1.声明不同的行为类来实现接口方法 代码: NormalChicken FlyWithXXX
 * 2.重新修改 AbstractChicken 的代码,最终效果就如下所示。
 */
public class NormalChicken extends AbstractChicken {

    @Override
    public void crow() {

    }

    @Override
    public void display() {

    }

//    implements FlyBehave
//    @Override
//    public void fly() {
//
//    }

    public static void main(String[] args) {
        NormalChicken chicken = new NormalChicken();
        chicken.crow();
        chicken.display();
        //通过setFlyBehave来指定flyBehave
        chicken.setFlyBehave(new NoFlyWith());
        chicken.strategyFly();
    }
}
