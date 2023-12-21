package scr.HomeWork8;

public interface Avto {
    void refuel(int liters);
    default void printReport(){
        System.out.println("Машина");
    }
}
