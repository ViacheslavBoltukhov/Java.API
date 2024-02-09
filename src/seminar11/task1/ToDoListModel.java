package src.seminar11.task1;

import java.util.ArrayList;
import java.util.List;

public class ToDoListModel {
    private List<String> tasks;

    public ToDoListModel() {
        tasks = new ArrayList<>();
    }

    public void addToList(String task) {
        tasks.add(task);
    }

    public void scratchFromList(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public int getListSize() {
        return tasks.size();
    }
}