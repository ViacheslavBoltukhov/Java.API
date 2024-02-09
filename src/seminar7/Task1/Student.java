package src.seminar7.Task1;

public class Student {
    // Поля класса
    private String name;
    private int age;

    // Конструктор класса
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод класса для вывода информации о студенте
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        // Создаем объект класса Student
        Student student1 = new Student("Иван", 20);

        // Вызываем метод объекта для вывода информации
        student1.displayInfo();
    }
}
