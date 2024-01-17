package scr.seminar12.task3;

public class Rectangle {
    protected double width;
    protected double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return String.format("%f=%f", height, width);
//        return "width = ${width} and height = ${height}";
    }

}
