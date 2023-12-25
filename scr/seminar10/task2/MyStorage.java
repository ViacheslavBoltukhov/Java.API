package scr.seminar10.task2;

// Объявление обобщенного интерфейса Storage с типом-параметром T
interface Storage<T> {
    void store(T item); // Метод для сохранения объекта в хранилище
    T retrieve();      // Метод для извлечения объекта из хранилища
}

// Реализация интерфейса Storage
public class MyStorage<T> implements Storage<T> {
    private T item; // Переменная для хранения объекта

    // Реализация метода store для сохранения объекта
    @Override
    public void store(T item) {
        this.item = item;
    }

    // Реализация метода retrieve для извлечения объекта
    @Override
    public T retrieve() {
        return item;
    }
}

// Демонстрация использования MyStorage
class Main {
    public static void main(String[] args) {
        // Создание экземпляра MyStorage для хранения строк
        Storage<String> stringStorage = new MyStorage<>();
        stringStorage.store("Пример строки");

        // Создание экземпляра MyStorage для хранения целых чисел
        Storage<Integer> integerStorage = new MyStorage<>();
        integerStorage.store(123);

        // Вывод хранимых данных
        System.out.println("Строка: " + stringStorage.retrieve());
        System.out.println("Число: " + integerStorage.retrieve());
    }
}