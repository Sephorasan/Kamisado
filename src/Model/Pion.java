package Model;

public class Pion {
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
