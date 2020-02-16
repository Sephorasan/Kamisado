package View;

import Controller.ControllerMenu;
import Tools.EffetsSonores;
import Tools.Music;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import static Tools.EffetsSonores.BipRetour;

public class ViewMenuOptions {

    private Menu model;
    private ImageView imgBg;
    private Group root;
    private Button btnRetour;
    private Slider musicSlider, effetsSlider;

    /**
     * Constructeur du menu principal
     *
     * @param model (Modèle correspondant au menu)
     * @param root  (Groupe principal de la vue)
     */

    ViewMenuOptions(Menu model, Group root) {
        this.root = root;
        this.model = model;
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 5) / 100;
        double posY = (primaryScreenBounds.getHeight() * 20) /100;
        initButtonMusic( posX + 1080, posY + 530);
        initButtoneffets( posX + 1080, posY + 680);

        btnRetour = initButton(posX + 680, posY + 750);
        btnRetour.setOnMousePressed(mouseEvent -> BipRetour());
        initBackground();
        setVueCompleteOptions();
    }

    private void initButtonMusic(double posX, double posY) {
        musicSlider = new Slider(0, 100, 100);
        musicSlider.setBlockIncrement(10);
        musicSlider.setShowTickLabels(true);
        musicSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> Music.setVolume(newValue.intValue() / 100.));
        musicSlider.setLayoutX(posX);
        musicSlider.setLayoutY(posY);
    }

    private void initButtoneffets(double posX, double posY) {
        effetsSlider = new Slider(0, 100, 100);
        effetsSlider.setBlockIncrement(10);
        effetsSlider.setShowTickLabels(true);
        effetsSlider.valueProperty().addListener(
                (observable, oldValue, newValue) -> EffetsSonores.setVolumeEffets(newValue.intValue() / 100.));
        effetsSlider.setLayoutX(posX);
        effetsSlider.setLayoutY(posY);
    }

    /**
     * Mise en place de l'image de fond en fonction de la taille de l'écran de l'utilisateur
     */
    private void initBackground() {
        imgBg = new ImageView("Asset/Images/fondOptions.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran
        imgBg.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBg.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    public Button initButton(double posX, double posY) {
        ImageView icon = new ImageView("Asset/Images/retourBtn.png");
        // Création d'un bouton
        Button b = new Button();
        b.setGraphic(icon);
        b.setLayoutX(posX);
        b.setLayoutY(posY);
        b.setBackground(null);

        //b.setText(texteB);

        return b;
    }

    void setVueCompleteOptions() {
        root.getChildren().clear();
        root.getChildren().add(imgBg);
        root.getChildren().add(btnRetour);
        root.getChildren().add(musicSlider);
        root.getChildren().add(effetsSlider);
    }

    void setEvents(ControllerMenu mc) {
        btnRetour.setOnMouseClicked(mc);
    }

    public Object getRetour() {
        return btnRetour;
    }
}