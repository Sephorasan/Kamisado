package View;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;

import java.awt.*;

public class ViewMenu {

    private Menu model;
    private Button btnJouer;
    private Button btnOptions;
    private Group root;

    ViewMenu(Menu model, Group root){
        this.root = root;
        this.model = model;
        innitBackground();

    }
    private void initBackground() {

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran


        videoBg = new MediaPlayer(new Media(this.getClass().getResource(Path.videomenu).toExternalForm()));
        videoBg.setCycleCount(MediaPlayer.INDEFINITE);
        viewer = new MediaView(videoBg);
        viewer.setFitHeight((int) primaryScreenBounds.getHeight());
        viewer.setFitWidth((int) primaryScreenBounds.getWidth());
        videoBg.stop();

    }
}
