package scr.seminar10.task3;

// Обобщенный класс Pair с двумя типами-параметрами T1 и T2
public class Pair<T1, T2> {
    private T1 first;  // Первый элемент пары
    private T2 second; // Второй элемент пары

    // Конструктор, принимающий объекты типов T1 и T2
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void PrintTypes() {
        System.out.println(first.getClass().getName());
        System.out.println(second.getClass().getName());
    }

    // Методы для получения элементов пары
    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    // Метод для печати элементов пары
    public void printPair() {
        System.out.println("Первый: " + first + ", Второй: " + second);
    }
}

// Демонстрация использования класса Pair
class Main {
    public static void main(String[] args) {
        // Создание пары из строки и числа
        Pair<String, Integer> pair = new Pair<>("Привет", 123);
        pair.PrintTypes();
        System.out.println(pair.getClass().getSimpleName());
        // Вывод элементов пары
        pair.printPair();
    }
}
