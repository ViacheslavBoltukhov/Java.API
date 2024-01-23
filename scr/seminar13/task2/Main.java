package scr.seminar13.task2;

// Шаг 5: Использование фабричных методов для создания фигур.
public class Main {
    public static void main(String[] args) {
        // Создание фабрики для кругов.
        ShapeFactory circleFactory = new CircleFactory();
        // Создание круга с помощью фабричного метода.
        Shape circle = circleFactory.createShape();
        // Отрисовка круга.
        circle.draw();

        // Создание фабрики для прямоугольников.
        ShapeFactory rectangleFactory = new RectangleFactory();
        // Создание прямоугольника с помощью фабричного метода.
        Shape rectangle = rectangleFactory.createShape();
        // Отрисовка прямоугольника.
        rectangle.draw();
    }
}