package scr.seminar10.task6;

// Обобщенный класс NumberBox, ограниченный типом Number
public class NumberBox<T extends Number> {
    private T number;

    // Конструктор, принимающий объект типа Number
    public NumberBox(T number) {
        this.number = number;
    }

    // Метод для получения числа
    public T getNumber() {
        return number;
    }

    // Метод для вывода числа
    public void printNumber() {
        System.out.println("Число: " + number);
    }
}

// Демонстрация использования класса NumberBox
class Main {
    public static void main(String[] args) {
        // Создание NumberBox для Integer и Double
        NumberBox<Integer> integerBox = new NumberBox<>(123);
        NumberBox<Double> doubleBox = new NumberBox<>(45.67);

        // Вывод чисел
        integerBox.printNumber();
        doubleBox.printNumber();
    }
}
