package Tools;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.nio.file.Paths;

public class EffetsSonores {

    private static final String BIP = "src/Asset/Sons/bip.mp3";
    private static final String BIPRETOUR = "src/Asset/Sons/bipRetour.mp3";
    private static double volume = 1;
    private static MediaPlayer mediaPlayer;


    public static void Bip() {
        mediaPlayer = new MediaPlayer(new Media(Paths.get(BIP).toUri().toString()));
        mediaPlayer.setCycleCount(1);
        mediaPlayer.setVolume(volume);
        mediaPlayer.play();
    }

    public static void BipRetour() {
        mediaPlayer = new MediaPlayer(new Media(Paths.get(BIPRETOUR).toUri().toString()));
        mediaPlayer.setCycleCount(1);
        mediaPlayer.setVolume(volume);
        mediaPlayer.play();
    }

    public static void setVolumeEffets(double volume) {
        EffetsSonores.volume = volume;
        if(mediaPlayer!=null) mediaPlayer.setVolume(volume);
    }
}
