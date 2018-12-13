package adapter.demo1;

/**
 * @author CookiesEason
 * 2018/12/13 21:34
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String type, String file) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: "+ file);
        } else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            //适配器 扩展播放功能
            MediaAdapter mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, file);
        } else {
            System.out.println("not support this type");
        }
    }
}
