package scr.seminar12.task3;

public class Main {
    public static void main(String[] args) {
        Rectangle square = new Square();
        square.setHeight(10);
        square.setWidth(5);
        System.out.println(square.toString());
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(15);
        System.out.println(rectangle.toString());
    }
}
