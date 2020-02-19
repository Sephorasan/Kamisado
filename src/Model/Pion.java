package Model;

public class Pion {
    /* Code Mehdi
    private CouleurPions couleurPions;
    private Position position;

    public enum CouleurPions { ORANGE, PINK, BLUE, PURPLE, YELLOW, RED, GREEN, BROWN }

    public Pion(CouleurPions couleurPions, Position position) {
        this.couleurPions = couleurPions;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public CouleurPions getCouleurPions() {
        return couleurPions;
    }

    public void setCouleurPions(CouleurPions couleurPions) {
        this.couleurPions = couleurPions;
    }
    */

    private String CouleurPions;
    private int Position;

    public int getPosition() {
        return Position;
    }

    public void setPosition(int position) {
        Position = position;
    }

    public Pion(String couleurPions) {
        CouleurPions = couleurPions;
    }

    public String getCouleurPions() {
        return CouleurPions;
    }

    public void setCouleurPions(String couleurPions) {
        CouleurPions = couleurPions;
    }

    /* ce code est à completer en fonction de la taille du tableau du plateau et de la couleur du pion et des cases

    public boolean estValide(Deplacement deplacement){
        if (deplacement.getDeplacementsurX() == 0)
            if (this.getCouleurPions().equals("la-couleur-en-question")){
                return ...
            } else{
                return ...
                return false;
            }
    }*/

}
