package Model;

public class Jeu {
    private boolean aPerdu;
    private String dispositionCouleurs;
    private boolean Joueur1, Joueur2;

    public Jeu(boolean aPerdu, String dispositionCouleurs, boolean joueur1, boolean joueur2) {
        this.aPerdu = aPerdu;
        this.dispositionCouleurs = dispositionCouleurs;
        this.Joueur1 = new Joueur();
        this.Joueur2 = new Joueur();
    }

    public boolean isaPerdu() {
        return aPerdu;
    }

    public void setaPerdu(boolean aPerdu) {
        this.aPerdu = aPerdu;
    }

    public String getDispositionCouleurs() {
        return dispositionCouleurs;
    }

    public void setDispositionCouleurs(String dispositionCouleurs) {
        this.dispositionCouleurs = dispositionCouleurs;
    }
}