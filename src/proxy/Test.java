package proxy;

import proxy.demo2.Image;
import proxy.demo2.ProxyImage;
import proxy.demo2.RealImage;

import java.lang.reflect.Proxy;

/**
 * @author CookiesEason
 * 2018/12/16 15:22
 */
public class Test {

    public static void main(String[] args) {
        Image image = new ProxyImage("xxx.jpg");

        // 图像将从磁盘加载
        image.display();
        // 图像不需要从磁盘加载
        image.display();
        System.out.println();

        //动态代理
        RealImage realImage = new RealImage("xxx.jpg");
        proxy.demo1.ProxyImage proxyImage = new proxy.demo1.ProxyImage(realImage);
        Image newImage = (Image) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{Image.class},
                proxyImage
        );
        newImage.display();
        newImage.display();
    }

}
