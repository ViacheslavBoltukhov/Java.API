package scr.homeWork8;

public interface Swimmable {

    void startSwimming();
    void stopSwimming();
    default void printReport(){
        System.out.println("Плавующее ТС");
    }
}
