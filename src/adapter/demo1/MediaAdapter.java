package adapter.demo1;

/**
 * @author CookiesEason
 * 2018/12/13 21:32
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(String type, String file) {
        if(type.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(file);
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(file);
        }
    }
}
