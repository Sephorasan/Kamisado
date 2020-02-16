package Model;


public class Deplacement {

    private double deplacementsurX;
    private double deplacementsurY;
    private Position depart;
    private Position arriver;

    public Deplacement(Position depart, Position arriver){
        this.depart = depart;
        this.arriver = arriver;
        this.deplacementsurY = arriver.getY() - depart.getY();
        this.deplacementsurX = arriver.getX() - depart.getX();
    }

    public double getDeplacementsurX(){
        return deplacementsurX;
    }

    public double getDeplacementsurY() {
        return deplacementsurY;
    }

    public Position getDepart(){
        return depart;
    }

    public Position getArriver(){
        return arriver;
    }

    public boolean estNull(){
        return deplacementsurX == 0 && deplacementsurY == 0;
    }
}
