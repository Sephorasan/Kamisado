package Model;

public class Pion {
    private int NombrePions;
    private String CouleurPions;

    public Pion(int nombrePions, String couleurPions) {
        NombrePions = nombrePions;
        CouleurPions = couleurPions;
    }

    public int getNombrePions() {
        return NombrePions;
    }

    public void setNombrePions(int nombrePions) {
        NombrePions = nombrePions;
    }

    public String getCouleurPions() {
        return CouleurPions;
    }

    public void setCouleurPions(String couleurPions) {
        CouleurPions = couleurPions;
    }


}
