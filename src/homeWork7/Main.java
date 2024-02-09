package src.homeWork7;
/*Создайте иерархию классов для представления различных геометрических фигур.
Каждая фигура должна иметь метод для вычисления площади (calculateArea)
и метод для вычисления периметра (calculatePerimeter). Реализуйте следующие фигуры:

Круг (Circle):

Свойства: радиус (radius).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.

Прямоугольник (Rectangle):

Свойства: длина (length) и ширина (width).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.

Квадрат (Square), который является подклассом прямоугольника:

Свойства: сторона (side).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.

И переопределите методы родительского класса, чтобы они соответствовали квадрату.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Select a shape: \n1 - Circle\n2 - Rectangle\n3 - Square");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        switch (shape){
            case "1":
                Square square = new Square();
                System.out.println("Input the side of square: ");
                square.setSide(Double.parseDouble(scanner.nextLine()));
                System.out.println("Area: " + square.calculateArea(square.getSide()));
                System.out.println("Perimeter: " + square.calculatePerimeter(square.getSide()));
                break;
            case "2":
                Rectangle rectangle = new Rectangle();
                System.out.println("Input the length and width of rectangle");
                rectangle.setLength( Double.parseDouble(scanner.nextLine()));
                rectangle.setWidth(Double.parseDouble(scanner.nextLine()));
                System.out.println("Area: " + rectangle.calculateArea(rectangle.getLength(), rectangle.getWidth()));
                System.out.println("Perimeter: " + rectangle.calculatePerimeter(rectangle.getLength(), rectangle.getWidth()));
                break;
            case "3":
                Circle circle = new Circle();
                System.out.println("Input the radius of circle: ");
                circle.setRadius(Double.parseDouble(scanner.nextLine()));
                System.out.println("Area: " + circle.calculateArea(circle.getRadius()));
                System.out.println("Perimeter :" + circle.calculatePerimeter(circle.getRadius()));
                break;
            default:
                System.out.println("Not shape");
        }
    }
}