package factory.abstractfactory;

import factory.Shape;

/**
 * @author CookiesEason
 * 2018/12/09 15:21
 */
public class Test {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();

    }
}
