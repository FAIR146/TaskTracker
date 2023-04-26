import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Manager {
    HashMap<Integer, Task> tasks = new HashMap<>();


    public Manager () {

    }
    public void createTask (String name, String description, Status status) {
        Epic epic = new Epic();
        epic.setName(name);
        epic.setDescription(description);
        epic.setStatus(status);
        tasks.put(id,epic); // ???

    }
    public void addSubTask (Epic epic, String name, String description, Status status) {
        SubTask subTask = new SubTask(epic);
        subTask.setDescription(description);
        subTask.setStatus(status);
        subTask.setName(name);
        epic.addSubTask(subTask);
    }
    public void getAllTasks () {
        tasks.forEach((key, value) -> {
            System.out.println("Задача:" + value);
        });
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
