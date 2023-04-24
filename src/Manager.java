import java.util.ArrayList;
import java.util.stream.Collectors;

public class Manager {
    ArrayList<Task> tasks = new ArrayList<>();
    Task task = new Task();
    String statusNew = "New";
    String statusInProgress = "In Progress";
    String statusDone = "Done";
    public Manager () {
        tasks.add(task);
    }
    public void setStatusNew (Task task) {
        task.setStatus(statusNew);
    }
    public void setStatusInProgress (Task task) {
        task.setStatus(statusInProgress);
    }
    public void setStatusDone (Task task) {
        task.setStatus(statusDone);
    }
    public void removeAllTasks() {
        tasks.removeAll(tasks);
    }
    public void removeTaskById (int id) {
        tasks.remove(id);
    }
    public Task getTaskById (int id) {
        tasks.stream()
                .filter(task -> task.getId() == id)
                .collect(Collectors.toList());
        return task;
    }
    public void setStatus () {

    }
}
