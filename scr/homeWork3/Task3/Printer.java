package scr.homeWork3.Task3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        List<Integer> sortArr = new ArrayList<>(Arrays.stream(arr).sorted().toList());
        int aver = 0;
        for (int elem : sortArr) {
            aver += elem;
        }
        System.out.println(sortArr);
        System.out.print("Minimum is ");
        System.out.println(sortArr.get(0));
        System.out.print("Maximum is ");
        System.out.println(sortArr.get(sortArr.size() - 1));
        System.out.print("Average is = ");
        System.out.println(aver / sortArr.size());
    }

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}
