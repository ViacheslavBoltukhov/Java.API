package scr.HomeWork8;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1, "X", "X1", 1999, 60, 30);
        Aircraft aircraft1 = new Aircraft(2, "A", "A1", 1965, 20, true);
        Boat boat1 = new Boat(3, "B", "B1", 2005, 15, false);
        System.out.println("---------------------------------Car-------------------------------");
        car1.startEngine();
        car1.stopEngine();
        car1.accelerate(10);
        car1.brake();
        car1.refuel(30);
        car1.displayInfo();
        car1.printReport();
        System.out.println("---------------------------------Air-------------------------------");
        aircraft1.startEngine();
        aircraft1.stopEngine();
        aircraft1.accelerate(20);
        aircraft1.brake();
        aircraft1.takeOff();
        aircraft1.land();
        aircraft1.displayInfo();
        aircraft1.printReport();
        System.out.println("---------------------------------Boat-------------------------------");
        boat1.startEngine();
        boat1.stopEngine();
        boat1.accelerate(30);
        boat1.brake();
        boat1.startSwimming();
        boat1.stopSwimming();
        boat1.displayInfo();
        boat1.printReport();
    }
}
