package scr.seminar8.Task1;

public class Dog extends Animal {
    // Конструктор класса Dog
    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    // Реализация метода makeSound() для собаки
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    public static void main(String[] args) {
        // Создание объекта собаки
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");

        // Вывод информации о собаке
        System.out.println("Information about the dog:");
        dog.displayInfo();

        // Издание звука собаки
        System.out.println("The dog makes the following sound:");
        dog.makeSound();
    }
}
