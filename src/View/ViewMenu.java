package View;

import Controller.ControllerMenu;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Menu;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;


public class ViewMenu {

    private Menu model;
    private javafx.scene.control.Button btnJouer;
    private javafx.scene.control.Button btnOptions;
    private javafx.scene.control.Button btnQuitter;
    private Group root;
    private ImageView imgBG;
    //private MediaView viewer;

    ViewMenu(Menu model, Group root) {
        this.root = root;
        this.model = model;
        initBackground();

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 5) / 100;
        double posY = (primaryScreenBounds.getHeight() * 20) / 100;

        btnJouer = initButton(posX, posY, "jouer");
        btnOptions = initButton(posX, posY + 70, "option");
        btnQuitter = initButton(posX, posY + 140, "quitter");

        setVueCompleteMenu();

    }

    public javafx.scene.control.Button initButton(double posX, double posY, String typebtn) {


        // Création d'un bouton
        javafx.scene.control.Button b = new javafx.scene.control.Button();
        if (typebtn.equals("jouer"))
            b.setGraphic(new javafx.scene.image.ImageView("Asset/Images/jouerBtn.png"));
        else if (typebtn.equals("option"))
            b.setGraphic(new javafx.scene.image.ImageView("Asset/Images/optionsBtn.png"));
        else
            b.setGraphic(new javafx.scene.image.ImageView("Asset/Images/quitterBtn.png"));

        b.setLayoutX(posX);
        b.setLayoutY(posY);
        b.setBackground(null);


        return b;
    }

    private void initBackground() {

        imgBG = new javafx.scene.image.ImageView("Asset/Images/imgChoixVaisseaux.jpg");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran
        imgBG.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBG.setFitWidth((int) primaryScreenBounds.getWidth());

    }

    void setVueCompleteMenu() {

        root.getChildren().clear();
        root.getChildren().add(imgBG);
        //root.getChildren().add(viewer);
        //root.getChildren().add(titre);
        root.getChildren().add(btnJouer);
        root.getChildren().add(btnOptions);
        root.getChildren().add(btnQuitter);



    }
    void setEvents(ControllerMenu mc) {
        btnJouer.setOnMouseClicked(mc);
        btnOptions.setOnMouseClicked(mc);
        btnQuitter.setOnMouseClicked(mc);

    }

    public javafx.scene.control.Button getQuitter() {
        return btnQuitter;
    }

    public javafx.scene.control.Button getBtnJouer() {
        return btnJouer;
    }

    public javafx.scene.control.Button getOptions() {
        return btnOptions;
    }
}
