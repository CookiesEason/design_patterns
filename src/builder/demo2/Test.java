package builder.demo2;

/**
 * @author CookiesEason
 * 2018/12/11 21:22
 * 非常经典的代码
 */
public class Test {

    public static void main(String[] args) {
        User.Builder builder = new User.Builder();
        User user = builder.setAge(10).setName("xxx").build();
        System.out.println(user);
    }

}
