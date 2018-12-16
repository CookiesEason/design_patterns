package proxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author CookiesEason
 * 2018/12/16 15:33
 */
public class ProxyImage implements InvocationHandler {

    private Object image;

    public ProxyImage(Object image) {
        this.image = image;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("动态代理");
        Object invoke = null;
        if ("display".equalsIgnoreCase(method.getName())) {
            invoke = method.invoke(image, args);
        }

        return invoke;
    }

}
