package Model;

public class Position {
    private double Y;
    private double X;

    public Position(double Y, double X) {
        this.Y = Y;
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        this.Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        this.X = x;
    }

    /*
    public boolean equals(Position position){
        return position.getX() == this.getX() && position.getY() == this.getY();
    }
    */
}
