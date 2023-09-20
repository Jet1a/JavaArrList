public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task(1,"Cleaning");
        Task task2 = new Task(2, "Homework");
        Task task3 = new Task(3, "Meeting");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        taskManager.listTask();

        taskManager.markTaskComplete(3);

        taskManager.listTask();

        taskManager.removeTask(2);

        taskManager.listTask();
    }
}