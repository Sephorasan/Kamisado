package Model;

import com.sun.jdi.Value;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;


public class Partie {
    private ImageView ORANGE;
    private  ImageView BLUE;
    private ImageView PURPLE;
    private  ImageView PINK;
    private ImageView YELLOW;
    private  ImageView RED;
    private ImageView GREEN;
    private  ImageView BROWN;

    private String DerniereCouleur;
    private String DernierePositionCouleur;
    public static final int COTE = 8;
    public Case[][] cases = new Case[COTE][COTE];


    public enum Valeur { ORANGE, PINK, BLUE, PURPLE, YELLOW, RED, GREEN, BROWN }
    private static final Valeur[][]  couleurPlateau = {
            { Valeur.ORANGE, Valeur.RED, Valeur.GREEN, Valeur.PINK,Valeur.YELLOW, Valeur.BLUE,Valeur.PURPLE,
                    Valeur.BROWN },
            {Valeur.BLUE,Valeur.ORANGE, Valeur.PINK,Valeur.PURPLE, Valeur.RED, Valeur.YELLOW,Valeur.BROWN,
                    Valeur.GREEN },
            { Valeur.PURPLE, Valeur.PINK,Valeur.ORANGE, Valeur.BLUE, Valeur.GREEN, Valeur.BROWN,Valeur.YELLOW,
                    Valeur.RED },
            { Valeur.PINK, Valeur.GREEN, Valeur.RED, Valeur.ORANGE, Valeur.BROWN, Valeur.PURPLE,Valeur.BLUE,
                    Valeur.YELLOW },
            {Valeur.YELLOW, Valeur.BLUE,Valeur.PURPLE,Valeur.BROWN,Valeur.ORANGE,Valeur.RED, Valeur.GREEN,
                    Valeur.PINK },
            {Valeur.RED, Valeur.YELLOW,Valeur.BROWN,Valeur.GREEN, Valeur.BLUE,Valeur.ORANGE,Valeur.PINK,
                    Valeur.PURPLE },
            {Valeur.GREEN,Valeur.BROWN, Valeur.YELLOW,Valeur.RED,Valeur.PURPLE, Valeur.PINK, Valeur.ORANGE,
                    Valeur.BLUE },
            {Valeur.BROWN,Valeur.PURPLE,Valeur.BLUE,Valeur.YELLOW, Valeur.PINK, Valeur.GREEN, Valeur.RED,
                    Valeur.ORANGE }
    };


    public Partie() {
    }

    public Partie(String derniereCouleur, String dernierePositionCouleur) {
        DerniereCouleur = derniereCouleur;
        DernierePositionCouleur = dernierePositionCouleur;
    }

    public void createPlateau(){
        for(int i=0; i<cases.length; i++) {
            for (int j = 0; j < cases[i].length; j++) {
                cases[i][j] = new Case(couleurPlateau[i][j]);
            }
        }
    }

    public Button afficherPlateau(int i) {
        ChargeImage();
        javafx.scene.control.Button Case = new javafx.scene.control.Button();
        Case.setPrefSize(10, 10);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃƒÂ©cupÃƒÂ©ration de la taille de l'ÃƒÂ©cran
        if (i == 0) {
            double posX = 50;
            double posY = 100;
            Case.setGraphic(ORANGE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);

        } if (i == 1) {
            double posX = 150;
            double posY = 100;
            Case.setGraphic(RED);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 2) {
            double posX = 250;
            double posY = 100;
            Case.setGraphic(GREEN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 3) {
            double posX = 350;
            double posY = 100;
            Case.setGraphic(PINK);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 4) {
            double posX = 450;
            double posY = 100;
            Case.setGraphic(YELLOW);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 5) {
            double posX = 550;
            double posY = 100;
            Case.setGraphic(BLUE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 6) {
            double posX = 650;
            double posY = 100;
            Case.setGraphic(PURPLE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 7) {
            double posX = 750;
            double posY = 100;
            Case.setGraphic(BROWN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }

        if (i == 8) {
            double posX = 50;
            double posY = 200;
            Case.setGraphic(BLUE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 9) {
            double posX = 150;
            double posY = 200;
            Case.setGraphic(ORANGE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 10) {
            double posX = 250;
            double posY = 200;
            Case.setGraphic(PINK);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 11) {
            double posX = 350;
            double posY = 200;
            Case.setGraphic(PURPLE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 12) {
            double posX = 450;
            double posY = 200;
            Case.setGraphic(RED);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 13) {
            double posX = 550;
            double posY = 200;
            Case.setGraphic(YELLOW);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 14) {
            double posX = 650;
            double posY = 200;
            Case.setGraphic(BROWN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 15) {
            double posX = 750;
            double posY = 200;
            Case.setGraphic(GREEN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }



        if (i == 16) {
            double posX = 50;
            double posY = 300;
            Case.setGraphic(PURPLE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 17) {
            double posX = 150;
            double posY = 300;
            Case.setGraphic(PINK);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 18) {
            double posX = 250;
            double posY = 300;
            Case.setGraphic(ORANGE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 19) {
            double posX = 350;
            double posY = 300;
            Case.setGraphic(BLUE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 20) {
            double posX = 450;
            double posY = 300;
            Case.setGraphic(GREEN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 21) {
            double posX = 550;
            double posY = 300;
            Case.setGraphic(BROWN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 22) {
            double posX = 650;
            double posY = 300;
            Case.setGraphic(YELLOW);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 23) {
            double posX = 750;
            double posY = 300;
            Case.setGraphic(RED);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }


        if (i == 24) {
            double posX = 50;
            double posY = 400;
            Case.setGraphic(PINK);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 25) {
            double posX = 150;
            double posY = 400;
            Case.setGraphic(GREEN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 26) {
            double posX = 250;
            double posY = 400;
            Case.setGraphic(RED);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 27) {
            double posX = 350;
            double posY = 400;
            Case.setGraphic(ORANGE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 28) {
            double posX = 450;
            double posY = 400;
            Case.setGraphic(BROWN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 29) {
            double posX = 550;
            double posY = 400;
            Case.setGraphic(PURPLE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 30) {
            double posX = 650;
            double posY = 400;
            Case.setGraphic(BLUE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 31) {
            double posX = 750;
            double posY = 400;
            Case.setGraphic(YELLOW);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }



        if (i == 32) {
            double posX = 50;
            double posY = 500;
            Case.setGraphic(YELLOW);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 33) {
            double posX = 150;
            double posY = 500;
            Case.setGraphic(BLUE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 34) {
            double posX = 250;
            double posY = 500;
            Case.setGraphic(PURPLE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 35) {
            double posX = 350;
            double posY = 500;
            Case.setGraphic(BROWN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 36) {
            double posX = 450;
            double posY = 500;
            Case.setGraphic(ORANGE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 37) {
            double posX = 550;
            double posY = 500;
            Case.setGraphic(RED);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 38) {
            double posX = 650;
            double posY = 500;
            Case.setGraphic(GREEN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 39) {
            double posX = 750;
            double posY = 500;
            Case.setGraphic(PINK);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }



        if (i == 40) {
            double posX = 50;
            double posY = 600;
            Case.setGraphic(RED);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 41) {
            double posX = 150;
            double posY = 600;
            Case.setGraphic(YELLOW);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 42) {
            double posX = 250;
            double posY = 600;
            Case.setGraphic(BROWN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 43) {
            double posX = 350;
            double posY = 600;
            Case.setGraphic(GREEN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 44) {
            double posX = 450;
            double posY = 600;
            Case.setGraphic(BLUE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 45) {
            double posX = 550;
            double posY = 600;
            Case.setGraphic(ORANGE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 46) {
            double posX = 650;
            double posY = 600;
            Case.setGraphic(PINK);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 47) {
            double posX = 750;
            double posY = 600;
            Case.setGraphic(PURPLE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }



        if (i == 48) {
            double posX = 50;
            double posY = 700;
            Case.setGraphic(GREEN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 49) {
            double posX = 150;
            double posY = 700;
            Case.setGraphic(BROWN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 50) {
            double posX = 250;
            double posY = 700;
            Case.setGraphic(YELLOW);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }
        if (i == 51) {
            double posX = 350;
            double posY = 700;
            Case.setGraphic(RED);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 52) {
            double posX = 450;
            double posY = 700;
            Case.setGraphic(PURPLE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 53) {
            double posX = 550;
            double posY = 700;
            Case.setGraphic(PINK);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 54) {
            double posX = 650;
            double posY = 700;
            Case.setGraphic(ORANGE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 55) {
            double posX = 750;
            double posY = 700;
            Case.setGraphic(BLUE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }




        if (i == 56) {
            double posX = 50;
            double posY = 800;
            Case.setGraphic(BROWN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 57) {
            double posX = 150;
            double posY = 800;
            Case.setGraphic(PURPLE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 58) {
            double posX = 250;
            double posY = 800;
            Case.setGraphic(BLUE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }
        if (i == 59) {
            double posX = 350;
            double posY = 800;
            Case.setGraphic(YELLOW);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        } if (i == 60) {
            double posX = 450;
            double posY = 800;
            Case.setGraphic(PINK);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 61) {
            double posX = 550;
            double posY = 800;
            Case.setGraphic(GREEN);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 62) {
            double posX = 650;
            double posY = 800;
            Case.setGraphic(RED);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }if (i == 63) {
            double posX = 750;
            double posY = 800;
            Case.setGraphic(ORANGE);
            Case.setLayoutX(posX);
            Case.setLayoutY(posY);
        }


        Case.setBackground(null);
        return Case;
    }



    public void ChargeImage() {
        ORANGE = new ImageView("Asset/Images/CouleurKamisado/CaseOrange.png");
        ORANGE.setFitWidth(100);
        ORANGE.setFitHeight(100);
        BLUE = new ImageView("Asset/Images/CouleurKamisado/CaseBleu.png");
        BLUE.setFitWidth(100);
        BLUE.setFitHeight(100);
        PURPLE = new ImageView("Asset/Images/CouleurKamisado/CaseViolet.png");
        PURPLE.setFitWidth(100);
        PURPLE.setFitHeight(100);
        PINK = new ImageView("Asset/Images/CouleurKamisado/CaseRose.png");
        PINK.setFitWidth(100);
        PINK.setFitHeight(100);
        YELLOW = new ImageView("Asset/Images/CouleurKamisado/CaseJaune.png");
        YELLOW.setFitWidth(100);
        YELLOW.setFitHeight(100);
        RED = new ImageView("Asset/Images/CouleurKamisado/CaseRouge.png");
        RED.setFitWidth(100);
        RED.setFitHeight(100);
        GREEN = new ImageView("Asset/Images/CouleurKamisado/CaseVerte.png");
        GREEN.setFitWidth(100);
        GREEN.setFitHeight(100);
        BROWN =new ImageView("Asset/Images/CouleurKamisado/CaseMarron.png");
        BROWN.setFitWidth(100);
        BROWN.setFitHeight(100);
    }



    public Case[][] getCases() {
        return cases;
    }

    public static Valeur[][] getCouleurPlateau() {
        return couleurPlateau;
    }

    public String getDerniereCouleur() {
        return DerniereCouleur;
    }

    public void setDerniereCouleur(String derniereCouleur) {
        DerniereCouleur = derniereCouleur;
    }

    public String getDernierePositionCouleur() {
        return DernierePositionCouleur;
    }

    public void setDernierePositionCouleur(String dernierePositionCouleur) {
        DernierePositionCouleur = dernierePositionCouleur;
    }

    public void deplacer(){

    }

}
