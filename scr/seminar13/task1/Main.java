package scr.seminar13.task1;

public class Main {
    public static void main(String[] args) {
        // Получение единственного экземпляра Singleton.
        Singleton singleton = Singleton.getInstance();

        // Вызов метода объекта Singleton.
        singleton.someMethod();

        // Попытка создать еще один экземпляр Singleton.
        // Этот код вызовет ошибку компиляции, так как конструктор Singleton приватный.
        // Singleton anotherInstance = new Singleton();
    }
}