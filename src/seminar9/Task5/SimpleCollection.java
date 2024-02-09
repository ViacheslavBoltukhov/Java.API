package src.seminar9.Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleCollection<T> implements Iterable<T> {
    private List<T> items;

    public SimpleCollection() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}
class Main {
    public static void main(String[] args) {
        SimpleCollection<String> myCollection = new SimpleCollection<>();

        myCollection.add("Apple");
        myCollection.add("Banana");
        myCollection.add("Cherry");

        for (String fruit : myCollection) {
            System.out.println(fruit);
        }
    }
}
