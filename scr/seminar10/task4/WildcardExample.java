package scr.seminar10.task4;

import java.util.List;
import java.util.Arrays;

public class WildcardExample {

    // Метод для печати списка с неизвестным типом элементов
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem); // Вывод каждого элемента списка
        }
    }

    public static void main(String[] args) {
        // Создание списка целых чисел
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        // Создание списка строк
        List<String> stringList = Arrays.asList("Привет", "Мир", "Java");

        // Вызов метода printList с разными типами списков
        System.out.println("Целочисленный список:");
        printList(intList);

        System.out.println("\nСписок строк:");
        printList(stringList);
    }
}
