/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
package src.seminar3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int n = 10;
        Random random = new Random();
        List<Integer> lst = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            lst.add(random.nextInt(0, 10));
        }
        System.out.println(lst);
        lst.sort(Comparator.reverseOrder());
        System.out.println(lst);
    }
}
