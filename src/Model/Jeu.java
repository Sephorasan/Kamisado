package Model;

public class Jeu {
    private boolean aPerdu;
    private String dispositionCouleurs;

    public Jeu(boolean aPerdu, String dispositionCouleurs) {
        this.aPerdu = aPerdu;
        this.dispositionCouleurs = dispositionCouleurs;
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