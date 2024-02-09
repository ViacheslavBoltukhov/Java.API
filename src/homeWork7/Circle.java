package src.homeWork7;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter(double radius){
        return 2 * Math.PI * radius;
    }
}
