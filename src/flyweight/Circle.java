package flyweight;

/**
 * @author CookiesEason
 * 2019/01/01 22:23
 */
public class Circle implements Shape {

    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name);
    }
}
