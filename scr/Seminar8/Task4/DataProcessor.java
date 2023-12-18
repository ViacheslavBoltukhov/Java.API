package scr.Seminar8.Task4;

// Интерфейс для обработки данных
public interface DataProcessor {
    // Абстрактный метод для чтения данных
    void readData(String data);

    // Абстрактный метод для обработки данных
    void processData();

    // Метод с реализацией по умолчанию
    default void printReport() {
        System.out.println("Генерация отчета...");
    }
}
