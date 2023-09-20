public class Task {
    private int taskId;
    private String description;
    private boolean status;

    public Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
        this.status = false;
    }

    public boolean getStatus() {
        return status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        if (status) {
            return true;
        } else return false;
    }

    public boolean markComplete() {
        return status = true;
    }

    public boolean markIncomplete() {
        return status = false;
    }
}