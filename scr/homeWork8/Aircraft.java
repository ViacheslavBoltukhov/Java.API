package scr.homeWork8;

public class Aircraft extends Vehicle implements Flyable {
    private int maxAltitude;

    private boolean isFlying;

    public Aircraft(int id, String brand, String model, int year, int maxAltitude, boolean isFlying) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;
    }

    @Override
    public void startEngine() {
        System.out.println("Air ON");
    }

    @Override
    public void stopEngine() {
        System.out.println("Air OFF");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Speed Air");
    }

    @Override
    public void brake() {
        System.out.println("Stop Air");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Max altitudey: " + maxAltitude);
        System.out.println("Is flying: " + isFlying);

    }

    @Override
    public void takeOff() {
        System.out.println("takeOff");
    }

    @Override
    public void land() {
        System.out.println("land");
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }
}
