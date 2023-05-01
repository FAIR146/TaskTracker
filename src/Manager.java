import java.util.List;

public class Manager  {
    private final TaskDao taskDao = new InMemoryTaskDao();

    public long addTask(String name, String description, Status status) {
        return taskDao.addTask(name,description,status);
    }

    public long addEpic(String name, String description) {
        return taskDao.addEpic(name, description);
    }

    public long addSubTask(long id, String name, String description, Status status) {
        return taskDao.addSubTask(id, name, description, status);
    }

    public void removeEpicById(long id) {
        taskDao.removeEpicById(id);
    }

    public void removeTaskById(long id) {
        taskDao.removeTaskById(id);
    }

    public void removeSubTaskById(long id) {
        taskDao.removeSubTaskById(id);
    }

    public void removeAllEpics() {
        taskDao.removeAllEpics();
    }

    public void removeAllSubTasks() {
        taskDao.removeAllSubTasks();
    }

    public void removeAllTasks() {
        taskDao.removeAllTasks();
    }

    public Epic getEpicById(long id) {
        return taskDao.getEpicById(id);
    }

    public Task getTaskById(long id) {
        return taskDao.getTaskById(id);
    }

    public SubTask getSubTaskById(long id) {
        return taskDao.getSubTaskById(id);
    }

    public List<Epic> getAllEpics() {
        return taskDao.getAllEpics();
    }

    public List<SubTask> getAllSubTasks() {
        return taskDao.getAllSubTasks();
    }

    public List<Task> getAllTasks() {
        return taskDao.getAllTasks();
    }
}
