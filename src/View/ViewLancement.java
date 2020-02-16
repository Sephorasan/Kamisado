package View;

import Controller.ControllerMenu;
import Tools.Path;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;

import static Tools.EffetsSonores.Bip;


public class ViewLancement {

    private Menu model;
    private Group root;
    private MediaPlayer videoBg;
    private Button appuyerIci;
    private MediaView viewer;


    ViewLancement(Menu model, Group root) {
        this.root = root;
        this.model = model;
        initBackground();

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 5) / 100;
        double posY = (primaryScreenBounds.getHeight() * 20) / 100;

        appuyerIci = initButton(posX + 1000, posY + 790);
        appuyerIci.setOnMousePressed(mouseEvent -> Bip());

        setVueCompleteLancement();
        videoBg.play();
    }

    public Button initButton(double posX, double posY) {
        ImageView icon = new ImageView("Asset/Images/BtnTransparant.png");
        // Création d'un bouton
        Button b = new Button();
        b.setGraphic(icon);
        b.setLayoutX(posX);
        b.setLayoutY(posY);
        b.setBackground(null);

        return b;
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

    void setVueCompleteLancement() {

        root.getChildren().clear();
        root.getChildren().add(viewer);
        //root.getChildren().add(titre);
        root.getChildren().add(appuyerIci);

    }

    void setEvents(ControllerMenu mc) {
        appuyerIci.setOnMouseClicked(mc);
    }


    public Button getAppuyerIci() {
        return appuyerIci;
    }
}
