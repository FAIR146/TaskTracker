import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Manager {
    HashMap<Integer, Task> tasks = new HashMap<>();


    public Manager () {

    }
    public void createEpic (String name, String description, Status status) {
        Epic epic = new Epic();
        epic.setName(name);
        epic.setDescription(description);
        epic.setStatus(status);
        tasks.put(id,epic);

    }
    public void addSubTask (Epic epic, String name, String description, Status status) {
        SubTask subTask = new SubTask(epic);
        subTask.setDescription(description);
        subTask.setStatus(status);
        subTask.setName(name);
        epic.addSubTask(subTask);
    }
    public List<Task> getAllTasks () {
        return new ArrayList<>(tasks.values());
    }
    public void getAllEpicSubTasks (Epic epic) {
        epic.getSubTasks();
    }
    public void removeAllTasks() {

    }
    public void removeTaskById (int id) {
       tasks.remove(id);
    }
    public Task getTaskById (int id) {
        return tasks.get(id);
    }

}
