import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTaskDao implements TaskDao{
    private final HashMap<Long, Task> taskHashMap = new HashMap<>();
    private final HashMap<Long, Epic> epicHashMap = new HashMap<>();
    private final HashMap<Long, SubTask> subTaskHashMap = new HashMap<>();
    private long idTask;
    private static long idGeneratorTask = 0;
    private long idEpic;
    private static long idGeneratorEpic = 0;
    private long idSubTask;
    private static long idGeneratorSubTask = 0;
    @Override
    public long addTask(String name, String description, Status status) {
        idTask = idGeneratorTask;
        idGeneratorTask++;
        Task task = new Task();
        task.setName(name);
        task.setDescription(description);
        task.setStatus(status);
        task.setId(idTask);
        taskHashMap.put(idTask, task);
        return task.getId();
    }

    @Override
    public long addEpic(String name, String description) {
        idEpic = idGeneratorEpic;
        idGeneratorEpic++;
        Epic epic = new Epic();
        epic.setName(name);
        epic.setDescription(description);
        epic.setId(idTask);
        epicHashMap.put(idTask, epic);
        return epic.getId();
    }

    @Override
    public long addSubTask(long id, String name, String description, Status status) {
        idSubTask = idGeneratorSubTask;
        idGeneratorSubTask++;
        SubTask subTask = new SubTask(getEpicById(id));
        subTask.setDescription(description);
        subTask.setStatus(status);
        subTask.setName(name);
        subTaskHashMap.put(id, subTask);
        return subTask.getId();
    }

    @Override
    public void removeEpicById(long id) {
        epicHashMap.remove(id);
    }

    @Override
    public void removeSubTaskById(long id) {
        subTaskHashMap.remove(id);
    }

    @Override
    public void removeTaskById(long id) {
        taskHashMap.remove(id);
    }

    @Override
    public void removeAllTasks() {
        taskHashMap.clear();
    }

    @Override
    public void removeAllEpics() {
        epicHashMap.clear();
    }

    @Override
    public void removeAllSubTasks() {
        subTaskHashMap.clear();
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(taskHashMap.values());
    }

    @Override
    public List<Epic> getAllEpics() {
        return new ArrayList<>(epicHashMap.values());
    }

    @Override
    public List<SubTask> getAllSubTasks() {
         return new ArrayList<>(subTaskHashMap.values());
    }

    @Override
    public Epic getEpicById(long id) {
        return epicHashMap.get(id);
    }

    @Override
    public SubTask getSubTaskById(long id) {
        return subTaskHashMap.get(id);
    }

    @Override
    public Task getTaskById(long id) {
        return taskHashMap.get(id);
    }
}
