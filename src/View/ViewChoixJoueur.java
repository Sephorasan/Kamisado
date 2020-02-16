package View;

import Controller.ControllerMenu;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

import static Tools.Music.AMBIANCE;
import static Tools.Music.startMainMenuMusic;

public class ViewChoixJoueur {
    private Button btnMenuP;
    private ImageView imgBGChoixJoueur;
    private Group root;
    private Menu model;

    public ViewChoixJoueur(Menu model, Group root) {
        this.root = root;
        this.model = model;
        initBackground();

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 5) / 100;
        double posY = (primaryScreenBounds.getHeight() * 20) / 100;
        btnMenuP = initButton(posX + 680, posY + 750);
        btnMenuP.setOnMousePressed(mouseEvent -> startMainMenuMusic());
    }

    public Button initButton(double posX, double posY) {
        ImageView icon = new ImageView("Asset/Images/menuPrincipaleBtn.png");
        // Création d'un bouton
        Button b = new Button();
        b.setGraphic(icon);
        b.setLayoutX(posX);
        b.setLayoutY(posY);
        b.setBackground(null);

        return b;
    }

    private void initBackground() {
        imgBGChoixJoueur = new ImageView("Asset/Images/fondCj.png");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran
        imgBGChoixJoueur.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBGChoixJoueur.setFitWidth((int) primaryScreenBounds.getWidth());
    }

    void setVueCompleteChoixJoueur() {
        root.getChildren().clear();
        root.getChildren().add(imgBGChoixJoueur);
        root.getChildren().add(btnMenuP);
    }

    void setEvents(ControllerMenu mc) {
        btnMenuP.setOnMouseClicked(mc);
    }

    public Button getBtnMenuP() {
        return btnMenuP;
    }
}
