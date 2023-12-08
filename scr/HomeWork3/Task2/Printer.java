package scr.HomeWork3.Task2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0) {
                newArr.add(arr[i]);
            }
        System.out.println(newArr);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{2, 4, 6, 8};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}