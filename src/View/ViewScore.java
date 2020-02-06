package View;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;



public class ViewScore {

    private Group root;
    private Menu model;
    private Text affichageScore;
    private Button boutonRetour;


    public ViewScore(Menu model, Group root) {
        this.root = root;
        this.model = model;
        //initTitre();
        //Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        //double x = (primaryScreenBounds.getWidth() * 11) / 100;
        //double y = (primaryScreenBounds.getHeight() * 28) /100;
        //initButtons( x, y);

        boutonRetour = initButton(100, 80);
    }

    public Button initButton(double x, double y) {
        ImageView icon = new ImageView("Asset/Images/Boutons/boutonRetour.png");

        Button b = new Button();
        b.setGraphic(icon);
        b.setLayoutX(x);
        b.setLayoutY(y);
        b.setBackground(null);
        return b;
    }


}
