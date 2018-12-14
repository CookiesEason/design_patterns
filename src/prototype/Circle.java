package prototype;

/**
 * @author CookiesEason
 * 2018/12/14 20:02
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
