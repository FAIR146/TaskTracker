import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager manager = new Manager();
    @Test
    public void answer () {
        int i = 2;
        int j = 3;
        int result = Calculator.calculate(i,j);
        Assertions.assertEquals(4, result);
    }

    @Test
    void addTask() {
        String name = "Сходить в школу";
        String description = "Собарться и пойти в школу";
        Status status = Status.NEW;
        long idTask = manager.addTask(name, description, status);
        Task task = manager.getTaskById(idTask);
        Assertions.assertEquals(name, task.getName());
        Assertions.assertEquals(description, task.getDescription());
        Assertions.assertEquals(status, task.getStatus());
    }

    @Test
    void addEpic() {
    }

    @Test
    void addSubTask() {
    }

    @Test
    void removeEpicById() {
    }

    @Test
    void removeTaskById() {
    }

    @Test
    void removeSubTaskById() {
    }

    @Test
    void removeAllEpics() {
    }

    @Test
    void removeAllSubTasks() {
    }

    @Test
    void removeAllTasks() {
    }

    @Test
    void getEpicById() {
    }

    @Test
    void getTaskById() {
    }

    @Test
    void getSubTaskById() {
    }

    @Test
    void getAllEpics() {
    }

    @Test
    void getAllSubTasks() {
    }

    @Test
    void getAllTasks() {
    }

    @Test
    void updateTask() {
    }

    @Test
    void updateEpic() {
    }

    @Test
    void updateSubTask() {
    }
}
