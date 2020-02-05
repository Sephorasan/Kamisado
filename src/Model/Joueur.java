package Model;

public class Joueur {
    private boolean Joueur1;
    private boolean Joueur2;

    public Joueur(boolean joueur1, boolean joueur2) {
        Joueur1 = joueur1;
        Joueur2 = joueur2;
    }

    public boolean isJoueur1() {
        return Joueur1;
    }

    public void setJoueur1(boolean joueur1) {
        Joueur1 = joueur1;
    }

    public boolean isJoueur2() {
        return Joueur2;
    }

    public void setJoueur2(boolean joueur2) {
        Joueur2 = joueur2;
    }
}
