package scr.seminar10.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Список для чтения, ограниченный сверху (extends)
        List<? extends Number> numbersReadonly = Arrays.asList(1, 2, 2.5, 3.14);

        // Печать числового списка
        printNumbers(numbersReadonly);

        // Список для добавления, ограниченный снизу (super)
        List<? super Integer> numbersWritable = new ArrayList<>();
        addNumbers(numbersWritable);

        // Печать обновленного списка
        printNumbers((List<? extends Number>) numbersWritable);
    }

    // Метод для печати чисел из списка
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }

    // Метод для добавления чисел в список
    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
}
