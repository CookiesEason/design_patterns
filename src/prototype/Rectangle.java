package prototype;

/**
 * @author CookiesEason
 * 2018/12/14 20:00
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
