package MVVM_pattern;

public class Main {
    public static void main(String[] args) {
        // Creating instances of ViewModel and View
        TaskListViewModel taskListViewModel = new TaskListViewModel();
        TaskListView taskListView = new TaskListView();

        // Adding tasks through ViewModel
        taskListViewModel.addTask("Task 1", "2024-1-20");
        taskListViewModel.addTask("Task 1", "2024-1-22");

        // Displaying initial tasks through View
        taskListView.displayTasks(taskListViewModel.getTasks());

        // Marking a task as completed through ViewModel
        taskListViewModel.markTaskCompleted("Task 1");

        // Displaying updated tasks throug View
        taskListView.displayTasks(taskListViewModel.getTasks());
    }
}
