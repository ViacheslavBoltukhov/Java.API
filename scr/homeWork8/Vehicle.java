package scr.homeWork8;

public abstract class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int year;

    // Конструктор класса Vehicle
    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Абстрактный метод для запуска двигателя
    abstract void startEngine();

    // Абстрактный метод для остановки двигателя
    abstract void stopEngine();

    // Абстрактный метод для увеличение скорости на указанное значение
    protected abstract void accelerate(int speed);

    // Абстрактный метод для прекращения движения
    abstract void brake();

    // Абстрактный метод для вывода информации о транспортном средстве
    abstract void displayInfo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
