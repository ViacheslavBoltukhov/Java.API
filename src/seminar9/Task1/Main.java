package src.seminar9.Task1;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (c, d) -> c + d;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
    }
}
