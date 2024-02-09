package src.seminar7.Task4;
/*Задача: Создание класса "Товар"

Создайте класс Product для представления товара в интернет-магазине. Каждый товар должен иметь следующие характеристики:

Название товара (name).
Цена товара (price).
Количество товара в наличии (quantity).
Класс Product должен обеспечивать следующую функциональность:

Конструктор, который принимает название, цену и количество товара и инициализирует соответствующие поля класса.
Методы get и set для каждой из характеристик товара (название, цена, количество).
Метод calculateTotalPrice, который будет вычислять общую стоимость товара на основе цены и количества.
Метод displayProductInfo, который будет выводить информацию о товаре (название, цена, количество) на экран.
Создайте несколько объектов класса Product и продемонстрируйте работу методов.*/



public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Apple");
        product1.setPrice(100);
        product1.setQuantity(10);

        Product product2 = new Product();
        product1.setName("Orange");
        product1.setPrice(120.50);
        product1.setQuantity(5);
        System.out.println(calculateTotalPrice(product1));
        displayProductInfo(product1);


    }
    static double calculateTotalPrice(Product product){
        return product.getPrice() * product.getQuantity();

    }
    static void displayProductInfo(Product product){
        System.out.println("Product: " + product.getName() + "\nPrice: " + product.getPrice() + "\nQuantuty: " + product.getQuantity());
    }
}
