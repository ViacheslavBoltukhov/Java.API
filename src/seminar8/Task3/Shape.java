package src.seminar8.Task3;

// Интерфейс для геометрических фигур
public interface Shape {
    // Абстрактный метод для вычисления площади
    double calculateArea();

    // Абстрактный метод для вычисления периметра
    double calculatePerimeter();

    // Метод с реализацией по умолчанию
    default void printInfo() {
        System.out.println("Это геометрическая фигура.");
    }
}
