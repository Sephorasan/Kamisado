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

    public void deplacer() {
        /*le pion ne peut pas depacer les cases 8 et + ou 0 et +
                et aussi ne peut pas passer a travers un autre pion.*/
        for(int pion = 0; pion < 0; pion++){
            if( pion ) {
                //positionX
            }
        }
    }

}
