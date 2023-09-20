import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getTaskId() == (taskId)) {
                tasks.remove(i);
                return;
            }
        }
    }
    public void listTask(){
        for (Task task: tasks) {
            System.out.println("Task ID: "+ task.getTaskId());
            System.out.println("Task Description: "+ task.getDescription());
            System.out.println("Task Status: "+ task.getStatus());
            System.out.println();
        }
    }
    public void markTaskComplete(int taskId){
        for (Task task : tasks) {
            if (task.getTaskId() == taskId){
                task.markComplete();
                break;
            }
        }
    }
    public void markTaskIncomplete(int taskId){
        for (Task task: tasks) {
            if (task.getTaskId() == taskId){
                task.markIncomplete();
                break;
            }
        }
    }
}
