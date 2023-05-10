import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.ref.SoftReference;

public class ManagerTest {
    Manager manager = new Manager();
//    @Test
//    public void answer () {
//        int i = 2;
//        int j = 3;
//        int result = Calculator.calculate(i,j);
//        Assertions.assertEquals(4, result);
//    }

    @Test
    void addTask() {
        String name = "Сходить в школу";
        String description = "Собарться и пойти в школу";
        Status status = Status.NEW;
        long idTask = manager.addTask(name, description, status);
        Task task = manager.getTaskById(idTask);
        Assertions.assertEquals(idTask, task.getId());
        Assertions.assertEquals(name, task.getName());
        Assertions.assertEquals(description, task.getDescription());
        Assertions.assertEquals(status, task.getStatus());
    }

    @Test
    void addEpic() {
        String name = "Поехать в лес";
        String description = "Собрать вещи";
        long idEpic = manager.addEpic(name,description);
        Epic epic = manager.getEpicById(idEpic);
        Assertions.assertEquals(idEpic, epic.getId());
        Assertions.assertEquals(name, epic.getName());
        Assertions.assertEquals(description, epic.getDescription());;
    }

    @Test
    void addSubTask() {
        String name = "Одеться";
        String description = "Встать";
        Status status = Status.NEW;
        long idSubTask = manager.addSubTask(0 ,name, description, status);
        SubTask subTask = manager.getSubTaskById(idSubTask);
        Assertions.assertEquals(name, subTask.getName());
        Assertions.assertEquals(description, subTask.getDescription());
        Assertions.assertEquals(status, subTask.getStatus());
    }

    @Test
    void removeEpicById() {
        long idEpic = manager.addEpic("", "");
        manager.getEpicById(idEpic);
        manager.removeEpicById(idEpic);
        manager.getEpicById(idEpic);
    }

    @Test
    void removeTaskById() {
        long idTask = manager.addTask("", "", Status.NEW);
        manager.getTaskById(idTask);
        manager.removeTaskById(idTask);
        manager.getTaskById(idTask);
    }

    @Test
    void removeSubTaskById() {
        Epic epic = new Epic();
        long idSubTask = manager.addSubTask(epic.getId(), "" , "", Status.NEW);
        manager.getSubTaskById(idSubTask);
        manager.removeSubTaskById(idSubTask);
        manager.getSubTaskById(idSubTask);
    }

    @Test
    void removeAllEpics() {
        String name1 = "1";
        String description1 = "1";
        String name2 = "2";
        String description2 = "2";
        long idEpic1 = manager.addEpic(name1, description1);
        long idEpic2 = manager.addEpic(name2, description2);
        manager.getAllEpics();
        manager.removeAllEpics();
        manager.getAllEpics();
    }

    @Test
    void removeAllSubTasks() {
        Epic epic1 = new Epic();
        Epic epic2 = new Epic();
        String name1 = "1";
        String description1 = "1";
        String name2 = "2";
        String description2 = "2";
        long idSubTask1 = manager.addSubTask(epic1.getId(), name1, description1, Status.NEW);
        long idSubtask2 = manager.addSubTask(epic2.getId(), name2, description2, Status.NEW);
        manager.getAllSubTasks();
        manager.removeAllSubTasks();
        manager.getAllSubTasks();
    }

    @Test
    void removeAllTasks() {
        String name1 = "1";
        String description1 = "1";
        String name2 = "2";
        String description2 = "2";
        long idTask1 = manager.addTask(name1, description1, Status.NEW);
        long idTask2 = manager.addTask(name2, description2, Status.NEW);
        manager.getAllTasks();
        manager.removeAllTasks();
        manager.getAllTasks();
    }

    @Test
    void getEpicById() {
        String name = "1";
        String description = "1";
        long idEpic = manager.addEpic(name, description);
        Epic epic1 = manager.getEpicById(idEpic);
        Assertions.assertEquals(name, epic1.getName());
        Assertions.assertEquals(description, epic1.getDescription());
    }

    @Test
    void getTaskById() {
        String name = "1";
        String description = "1";
        Status status = Status.NEW;
        long idTask = manager.addTask(name, description, status);
        Task task1 = manager.getTaskById(idTask);
        Assertions.assertEquals(name, task1.getName());
        Assertions.assertEquals(description, task1.getDescription());
        Assertions.assertEquals(status, task1.getStatus());
    }

    @Test
    void getSubTaskById() {
        Epic epic = new Epic();
        String name = "1";
        String description = "1";
        Status status = Status.NEW;
        long idSubTask = manager.addSubTask(epic.getId() ,name, description, status);
        SubTask subTask1 = manager.getSubTaskById(idSubTask);
        Assertions.assertEquals(name, subTask1.getName());
        Assertions.assertEquals(description, subTask1.getDescription());
        Assertions.assertEquals(status, subTask1.getStatus());
    }

    @Test
    void getAllEpics() {
        String name1 = "1";
        String description1 = "1";
        String name2 = "2";
        String description2 = "2";
        long idEpic1 = manager.addEpic(name1, description1);
        long idEpic2 = manager.addEpic(name2, description2);
        Epic epicFirst = manager.getEpicById(idEpic1);
        Epic epicSecond = manager.getEpicById(idEpic2);
        manager.getAllEpics();
        Assertions.assertEquals(name1, epicFirst.getName());
        Assertions.assertEquals(description1, epicFirst.getDescription());
        Assertions.assertEquals(name2, epicSecond.getName());
        Assertions.assertEquals(description2, epicSecond.getDescription());
    }

    @Test
    void getAllSubTasks() {
        Epic epic1 = new Epic();
        Epic epic2 = new Epic();
        String name1 = "1";
        String description1 = "1";
        String name2 = "2";
        String description2 = "2";
        Status status1 = Status.NEW;
        Status status2 = Status.NEW;
        long idSubTask1 = manager.addSubTask(epic1.getId(), name1, description1, status1);
        long idSubTask2 = manager.addSubTask(epic2.getId(), name2, description2, status2);
        SubTask subTaskFirst = manager.getSubTaskById(idSubTask1);
        SubTask subTaskSecond = manager.getSubTaskById(idSubTask2);
        manager.getAllEpics();
        Assertions.assertEquals(name1, subTaskFirst.getName());
        Assertions.assertEquals(description1, subTaskFirst.getDescription());
        Assertions.assertEquals(status1, subTaskFirst.getStatus());
         Assertions.assertEquals(name2, subTaskSecond.getName());
        Assertions.assertEquals(description2, subTaskSecond.getDescription());
        Assertions.assertEquals(status2, subTaskSecond.getStatus());

    }

    @Test
    void getAllTasks() {
        String name1 = "1";
        String description1 = "1";
        Status status1 = Status.NEW;
        String name2 = "2";
        String description2 = "2";
        Status status2 = Status.NEW;
        long idTask1 = manager.addTask(name1, description1, status1);
        long idTask2 = manager.addTask(name2, description2, status2);
        Task taskFirst = manager.getTaskById(idTask1);
        Task taskSecond = manager.getTaskById(idTask2);
        manager.getAllTasks();
        Assertions.assertEquals(name1, taskFirst.getName());
        Assertions.assertEquals(description1, taskFirst.getDescription());
        Assertions.assertEquals(status1, taskFirst.getStatus());
        Assertions.assertEquals(name2, taskSecond.getName());
        Assertions.assertEquals(description2, taskSecond.getDescription());
        Assertions.assertEquals(status2, taskSecond.getStatus());
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
