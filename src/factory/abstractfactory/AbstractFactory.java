package factory.abstractfactory;

import factory.Shape;

/**
 * @author CookiesEason
 * 2018/12/09 15:18
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape) ;

}
