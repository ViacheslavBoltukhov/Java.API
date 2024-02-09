package src.homeWork14.task3;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return new int[]{0};
        } else {
            int[] lst = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (b[i] != 0) {
                    lst[i] = a[i] / b[i];
                } else {
                    throw new RuntimeException("Divide by zero");
                }
            }
            return lst;
        }

    }

}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}