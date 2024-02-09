package src.seminar10.task1;
// Определение обобщенного класса Box с типом-параметром T
public class Box<T> {
    // Объявление переменной типа T
    private T content;

    // Конструктор класса, принимающий объект типа T
    public Box(T content) {
        this.content = content;
    }

    // Метод для получения содержимого коробки
    public T getContent() {
        return content;
    }

    // Метод для установки нового содержимого коробки
    public void setContent(T content) {
        this.content = content;
    }

    // Метод для печати информации о содержимом коробки
    public void printContent() {
        System.out.println("Содержимое коробки: " + content.toString());
    }
}

// Демонстрация использования класса Box
class Main {
    public static void main(String[] args) {
        // Создаем коробку для хранения целых чисел
        Box<Integer> integerBox = new Box<>(123);

        // Создаем коробку для хранения строк
        Box<String> stringBox = new Box<>("Привет, мир!");

        // Выводим содержимое коробок
        integerBox.printContent();
        stringBox.printContent();
    }
}