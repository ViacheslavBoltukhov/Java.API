package src.seminar7.Task3;

public class Person {
    // Приватное поле, которое мы хотим инкапсулировать
    private int age;

    // Геттер для получения значения поля age
    public int getAge() {
        return age;
    }

    // Сеттер для установки значения поля age
    public void setAge(int age) {
        // Можно добавить проверки на корректность значения age здесь
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем объект класса Person
        Person person = new Person();

        // Устанавливаем возраст с использованием сеттера
        person.setAge(30);

        // Получаем возраст с использованием геттера и выводим на экран
        System.out.println("Возраст: " + person.getAge());

        // Попытка установить отрицательный возраст
        person.setAge(-5); // Выведет сообщение об ошибке
    }
}
