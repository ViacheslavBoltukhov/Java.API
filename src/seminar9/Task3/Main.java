package src.seminar9.Task3;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class Main {
//    public static void main(String[] args) {
//        Consumer<String> printConsumer = System.out::println;
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//        names.forEach(printConsumer);
//    }
//}
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println("Is 5 positive? " + isPositive.test(5));
        System.out.println("Is -5 positive? " + isPositive.test(-5));
    }
}