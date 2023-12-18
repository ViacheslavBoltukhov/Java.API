package scr.Seminar8.Task2;

// Класс, реализующий интерфейс MyInterface
public class MyClass1 implements MyInterface {
    // Реализация абстрактного метода из интерфейса
    @Override
    public void abstractMethod() {
        System.out.println("MyClass1: Implementation of abstractMethod");
    }

    // Переопределение метода с реализацией по умолчанию
    @Override
    public void defaultMethod() {
        System.out.println("MyClass1: Overridden defaultMethod");
    }
}

// Другой класс, также реализующий интерфейс MyInterface
class MyClass2 implements MyInterface {
    // Реализация абстрактного метода из интерфейса
    @Override
    public void abstractMethod() {
        System.out.println("MyClass2: Implementation of abstractMethod");
    }
}
