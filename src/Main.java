public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addTask("Школа", "Собраться и пойти в школу", Status.NEW);
        System.out.println(manager.getTaskById(0));
        manager.addEpic("Поездка", "Съездить на озеро");
        System.out.println(manager.getEpicById(0));
        manager.addSubTask(0,"Собрать вещи","Проснуться, взять портфель", Status.NEW);
        System.out.println(manager.getEpicById(0));

    }
}