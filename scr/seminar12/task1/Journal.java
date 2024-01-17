package scr.seminar12.task1;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> entris;

    public Journal() {
        this.entris = new ArrayList<>();
    }

    public List<String> getEntrise() {
        return entris;
    }

    public void addEntry(String element) {
        entris.add(element);
    }
    public void removeEntry(String element) {
        entris.remove(element);
    }

}
