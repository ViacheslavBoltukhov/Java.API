package src.seminar10.task7;

import java.util.ArrayList;
import java.util.List;

// Обобщенный класс NumberProcessor с ограничением типа T
public class NumberProcessor<T extends Number> {
    private List<T> numbers;

    public NumberProcessor() {
        this.numbers = new ArrayList<>();
    }

    // Метод для добавления числа в список
    public void addNumber(T number) {
        numbers.add(number);
    }

    // Метод для обработки чисел с использованием Consumer с ограничением super
    public void processNumbers(List<? super T> destination) {
        destination.addAll(numbers);
    }

    // Метод для вывода чисел
    public void printNumbers() {
        for (T num : numbers) {
            System.out.println(num);
        }
    }
}

// Демонстрация использования NumberProcessor
class Main {
    public static void main(String[] args) {
        // Создание NumberProcessor для Integer
        NumberProcessor<Integer> integerProcessor = new NumberProcessor<>();
        integerProcessor.addNumber(10);
        integerProcessor.addNumber(20);

        // Создание списка для объектов типа Number
        List<Number> numberList = new ArrayList<>();

        // Обработка чисел и добавление в список Number
        integerProcessor.processNumbers(numberList);

        // Вывод содержимого numberList
        System.out.println("Содержимое numberList:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
