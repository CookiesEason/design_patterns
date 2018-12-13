package adapter.demo1;

/**
 * @author CookiesEason
 * 2018/12/13 21:36
 */
public class Test {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "xxx.mp3");
        audioPlayer.play("mp4", "xxx.mp4");
        audioPlayer.play("vlc", "xxx.vlc");
        audioPlayer.play("avi", "xxx.avi");
    }

}
