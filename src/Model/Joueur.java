package Model;

import java.util.ArrayList;

public class Joueur{
    private int NbrPions = 16;
    private ArrayList<Pion> ListeDesPions;

    public Joueur(){
        this.ListeDesPions = ArrayList<>();
        for (int i = 0; i < NbrPions; i++ ){
            ListeDesPions.add(new Pion("ORANGE"));
            ListeDesPions.add(new Pion("BLUE"));
            ListeDesPions.add(new Pion("PURPLE"));
            ListeDesPions.add(new Pion("PINK"));
            ListeDesPions.add(new Pion("YELLOW"));
            ListeDesPions.add(new Pion("RED"));
            ListeDesPions.add(new Pion("GREEN"));
            ListeDesPions.add(new Pion("BROWN"));
        }
    }

    public void deplacerPion(){

    }
}

