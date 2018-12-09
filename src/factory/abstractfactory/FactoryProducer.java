package factory.abstractfactory;

/**
 * @author CookiesEason
 * 2018/12/09 15:20
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        if(type.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(type.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}
