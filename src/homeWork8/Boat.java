package src.homeWork8;

public class Boat extends Vehicle implements Swimmable {
    private int maxSpeed;
    private boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed, boolean isSailing) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = isSailing;
    }


    @Override
    void startEngine() {
        System.out.println("Boat ON");
    }

    @Override
    void stopEngine() {
        System.out.println("Boat OFF");
    }

    @Override
    public void brake() {
        System.out.println("Stop Boat");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Speed Boat");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Is sailing: " + isSailing);

    }

    @Override
    public void startSwimming() {
        System.out.println("startSwimming");
    }
    @Override
    public void stopSwimming() {
        System.out.println("stopSwimming");
    }




    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isSailing() {
        return isSailing;
    }

    public void setSailing(boolean sailing) {
        isSailing = sailing;
    }
}