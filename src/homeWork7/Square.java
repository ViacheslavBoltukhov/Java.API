package src.homeWork7;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double calculateArea(double side){
        return side * side;
    }
    public double calculatePerimeter(double side){
        return side * 4;
    }
}
