package src.homeWork8;

public class Car extends Vehicle implements Avto{
    private int fuelCapacity;
    private int currentFuelLevel;
    public Car(int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }


    @Override
    public void startEngine() {
        System.out.println("Avto ON");

    }

    @Override
    public void stopEngine() {
        System.out.println("Avto OFF");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Speed Avto");
    }

    @Override
    public void brake() {
        System.out.println("Stop Avto");
    }


    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Fuel capacity: " + fuelCapacity);
        System.out.println("Current fuel level: " + currentFuelLevel);

    }
    @Override
    public void refuel(int liters){
        System.out.println("Увеличение уровня топлива на " + liters + " литров");
    }
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }
}
