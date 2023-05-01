import java.util.HashMap;
import java.util.List;

public interface TaskDao {
     long addTask (String name, String description, Status status);
     long addEpic (String name, String description);
     long addSubTask (long id ,String name, String description, Status status);
     void removeEpicById (long id);
     void removeSubTaskById (long id);
     void removeTaskById (long id);
     void removeAllTasks();
     void removeAllEpics ();
     void removeAllSubTasks ();
     List<Task> getAllTasks ();
     List<Epic> getAllEpics ();
     List<SubTask> getAllSubTasks ();
     Epic getEpicById (long id);
     SubTask getSubTaskById (long id);
     Task getTaskById (long id);
}
