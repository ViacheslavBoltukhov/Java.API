package scr.HomeWork8;

public interface Flyable {

    void takeOff();

    void land();
    default void printReport(){
        System.out.println("Летающее ТС");
    }

}
