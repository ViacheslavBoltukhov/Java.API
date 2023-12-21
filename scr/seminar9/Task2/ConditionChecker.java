package scr.seminar9.Task2;
@FunctionalInterface
interface ConditionChecker {
    boolean check(int number);
}

class Main {
    public static void main(String[] args) {
        ConditionChecker isEven = n -> n % 2 == 0;
        ConditionChecker isPositive = n -> n > 0;

        System.out.println("Is 4 even? " + isEven.check(4));
        System.out.println("Is -3 positive? " + isPositive.check(-3));
    }
}
