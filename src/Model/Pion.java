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


}
