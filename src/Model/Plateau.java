package Model;

import java.util.ArrayList;

public class Plateau {
    private int NombreCases;
    private ArrayList<ListePieces> ListePieces;
    private String DerniereCouleur;
    private String DernierePositionCouleur;
    public static final int COTE = 8;


    public Plateau(int nombreCases, ArrayList<ListePieces> listePieces, String derniereCouleur, String dernierePositionCouleur) {
        NombreCases = nombreCases;
        ListePieces = listePieces;
        DerniereCouleur = derniereCouleur;
        DernierePositionCouleur = dernierePositionCouleur;
    }

    public void createPlateau() {
        String[][] plateau = new String[COTE][COTE];
        for (int i = 0; i < Plateau[].length; i++) {
            for (int j = 0; j < Plateau[i].length; j++) {

            }
        }
    }


    public int getNombreCases() {
        return NombreCases;
    }

    public void setNombreCases(int nombreCases) {
        NombreCases = nombreCases;
    }

    public ArrayList<ListePieces> getListePieces() {
        return ListePieces;
    }

    public void setListePieces(ArrayList<ListePieces> listePieces) {
        ListePieces = listePieces;
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

}
