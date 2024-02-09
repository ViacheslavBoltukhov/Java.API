package src.seminar9.Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        // Список теперь содержит ["Alice", "Bob", "Charlie", "Diana"]
        // Получаем итератор для списка
        Iterator<String> iterator = names.iterator();

        // Перебираем элементы списка
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}