package scr.Seminar8.Task2;

// Объявление интерфейса с методами и переменными
public interface MyInterface {
    // Переменные в интерфейсе (константы)
    int MAX_VALUE = 100;
    String NAME = "My Interface";

    // Абстрактный метод (без реализации)
    void abstractMethod();

    // Метод с реализацией по умолчанию (default method)
    default void defaultMethod() {
        System.out.println("Default method in the interface.");
    }

    // Статический метод (static method)
    static void staticMethod() {
        System.out.println("Static method in the interface.");
    }
}