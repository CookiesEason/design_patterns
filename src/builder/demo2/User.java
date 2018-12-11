package builder.demo2;

/**
 * @author CookiesEason
 * 2018/12/11 21:18
 * 非常经典的代码，可以从许多java原生代码里发现
 */
public class User {


    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class Builder {

        private User user = new User();

       public Builder setName(String name) {
           user.name = name;
           return this;
       }

       public Builder setAge(int age) {
           user.age = age;
           return this;
       }

       public User build() {
           return user;
       }

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
