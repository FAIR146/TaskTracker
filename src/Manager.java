import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Manager extends InMemoryTaskDao {
    public Manager () {

    }

    @Override
    public long addTask(String name, String description, Status status) {
        return super.addTask(name, description, status);
    }

    @Override
    public long addEpic(String name, String description) {
        return super.addEpic(name, description);
    }

    @Override
    public long addSubTask(long id, String name, String description, Status status) {
        return super.addSubTask(id, name, description, status);
    }

    @Override
    public void removeEpicById(long id) {
        super.removeEpicById(id);
    }

    @Override
    public void removeTaskById(long id) {
        super.removeTaskById(id);
    }

    @Override
    public void removeSubTaskById(long id) {
        super.removeSubTaskById(id);
    }

    @Override
    public void removeAllEpics() {
        super.removeAllEpics();
    }

    @Override
    public void removeAllSubTasks() {
        super.removeAllSubTasks();
    }

    @Override
    public void removeAllTasks() {
        super.removeAllTasks();
    }

    @Override
    public Epic getEpicById(long id) {
        return super.getEpicById(id);
    }

    @Override
    public Task getTaskById(long id) {
        return super.getTaskById(id);
    }

    @Override
    public SubTask getSubTaskById(long id) {
        return super.getSubTaskById(id);
    }

    @Override
    public List<Epic> getAllEpics() {
        return super.getAllEpics();
    }

    @Override
    public List<SubTask> getAllSubTasks() {
        return super.getAllSubTasks();
    }

    @Override
    public List<Task> getAllTasks() {
        return super.getAllTasks();
    }
}
