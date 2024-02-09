package src.seminar11.task1;

public class ToDoListController {
    private ToDoListModel toDoListModel;
    private ToDoListView toDoListView;

    public ToDoListController(ToDoListModel model, ToDoListView view) {
        this.toDoListModel = model;
        this.toDoListView = view;
    }

    public void runToDoList() {
        boolean exit = false;
        do {
            toDoListView.displayTasks(toDoListModel.getTasks());
            System.out.println("Что вы хотите сделать? 1: Добавить задачу   2: Удалить задачу   0: Выйти");
            int choice = toDoListView.getUserChoice();

            switch (choice) {
                case 1:
                    String newTask = toDoListView.getUserInput("Введите новую задачу");
                    toDoListModel.addToList(newTask);
                    break;
                case 2:
                    System.out.println("Введите номер задачи для удаления");
                    int taskIndex = toDoListView.getUserChoice();
                    toDoListModel.scratchFromList(taskIndex - 1);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        } while (!exit);
    }

    public static void main(String[] args) {
        ToDoListModel model = new ToDoListModel();
        ToDoListView view = new ToDoListView();
        ToDoListController controller = new ToDoListController(model, view);

        controller.runToDoList();
    }
}