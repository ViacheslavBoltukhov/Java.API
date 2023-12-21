package scr.seminar1;
/*Реализовать функцию возведения числа а в степень b. a, b из Z. 
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1 */
import java.util.Scanner;

public class program3 {

    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введите а: ");
            int a = iScanner.nextInt();
            System.out.println("Введите b: ");
            int b = iScanner.nextInt();
            System.out.println(pow(a, b));
        }

    }

    public static double pow(double a, int b) {

        if (b == 0 || a == 1) {
            return 1;
        }

        double res = 1;
        if (b < 0) {
            b = -b;
            a = 1.0 / a;
        }
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;

    }
}