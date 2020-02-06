package Model;

import java.util.ArrayList;

public class Partie {

    private String DerniereCouleur;
    private String DernierePositionCouleur;
    public static final int COTE = 8;


    public Partie(String derniereCouleur, String dernierePositionCouleur) {
        DerniereCouleur = derniereCouleur;
        DernierePositionCouleur = dernierePositionCouleur;
    }

    public void createPlateau() {
        String[][] plateau = new String[COTE][COTE];
        for (int i = 0; i < Partie[].length; i++) {
            for (int j = 0; j < Partie[i].length; j++) {

            }
        }
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
