package adapter.demo1;

/**
 * @author CookiesEason
 * 2018/12/13 21:25
 */
public interface MediaPlayer {

    /**
     * 本身只支持播放mp3功能，现在要对其功能进行扩展
     * @param type
     * @param file
     */
    void play(String type, String file);

}
