package scr.seminar7.Task2;

public class Animal {
    // Поле класса
    protected String name;

    // Конструктор класса
    public Animal(String name) {
        this.name = name;
    }

    // Метод класса для издания звука
    public void makeSound() {
        System.out.println("Звук животного");
    }
}

class Dog extends Animal {
    // Конструктор подкласса
    public Dog(String name) {
        super(name);
    }

    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем объекты классов Animal и Dog
        Animal animal = new Animal("Животное");
        Dog dog = new Dog("Барсик");

        // Вызываем методы makeSound для каждого объекта
        animal.makeSound();
        dog.makeSound();
    }
}
