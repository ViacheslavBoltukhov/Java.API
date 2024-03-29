package src.homeWork7;

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double calculateArea(double length, double width){
        return length * width;
    }
    public double calculatePerimeter(double length, double width){
        return 2 * (length + width);
    }
}
