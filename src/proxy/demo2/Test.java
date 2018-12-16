package proxy.demo2;

/**
 * @author CookiesEason
 * 2018/12/16 15:22
 */
public class Test {

    public static void main(String[] args) {
        Image image = new ProxyImage("xxx.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println();
        // 图像不需要从磁盘加载
        image.display();
    }

}
