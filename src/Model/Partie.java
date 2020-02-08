package Model;

import java.util.ArrayList;

public class Partie {

    private String DerniereCouleur;
    private String DernierePositionCouleur;
    public static final int COTE = 8;
    public Case[][] cases;
    public enum Valeur { ORANGE, PINK, BLUE, PURPLE, YELLOW, RED, GREEN, BROWN }

    private static final Valeur[][]  plateau = {
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
                    Valeur.ORANGE } };


    public Partie(String derniereCouleur, String dernierePositionCouleur) {
        DerniereCouleur = derniereCouleur;
        DernierePositionCouleur = dernierePositionCouleur;
    }

    public void createPlateau() {

        for(int i=0; i<plateau.length; i++) {
            for(int j=0; j<plateau[i].length; j++) {
                plateau[i][j]= new Case(/*Valeur[j]*/);
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
