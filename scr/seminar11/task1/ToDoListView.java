package scr.seminar11.task1;

import java.util.List;
import java.util.Scanner;

public class ToDoListView {
    private Scanner scanner;

    public ToDoListView() {
        scanner = new Scanner(System.in);
    }

    public void displayTasks(List<String> tasks) {
        System.out.println("Список задач:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public int getUserChoice() {
        System.out.print("Ваш выбор: ");
        return scanner.nextInt();
    }

    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.next();
    }
}