import java.util.ArrayList;
import java.util.List;


public class Epic extends Task {
    private final List<SubTask> subTasks = new ArrayList<>();
    public void addSubTask (SubTask subTask) {
        subTasks.add(subTask);
    }

    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void removeSubTaskById (int id) {
        subTasks.removeIf(subTask -> subTask.getId() == id);
    }

    @Override
    public String toString() {
        return "Epic{" + System.lineSeparator() +
                "name=" + getName() + System.lineSeparator() +
                "id=" + getId() + System.lineSeparator() +
                "description=" + getDescription() + System.lineSeparator() +
                "status=" + getStatus() + System.lineSeparator() +
                "subTasks=" + subTasks + System.lineSeparator() +
                '}';
    }
}
