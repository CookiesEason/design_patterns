package proxy.demo2;

/**
 * @author CookiesEason
 * 2018/12/16 15:21
 */
public class ProxyImage implements Image {

    private Image realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
