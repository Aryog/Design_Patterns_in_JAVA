package MVVM_pattern;

import java.util.ArrayList;
import java.util.List;

// ViewModel
public class TaskListViewModel {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String taskName, String dueDate) {
        Task newTask = new Task(taskName, dueDate);
        tasks.add(newTask);
    }

    public void markTaskCompleted(String taskName) {
        for (Task task : tasks) {
            // In real world can use the taskId
            if (task.getTaskName().equals(taskName)) {
                task.markCompleted();
                break;
            }
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

// View
class TaskListView {
    public void displayTasks(List<Task> tasks) {
        System.out.println("Task List: ");
        for (Task task : tasks) {
            String status = task.isCompleted() ? "Completed" : "Not Completed";
            System.out.println(task.getTaskName() + " - Due: " + task.getDueDate() + " - Status: " + status);
        }
    }
}