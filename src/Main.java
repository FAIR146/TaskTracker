public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.createEpic("Школа", "нужно прийти в школу",Status.NEW);
        manager.getAllTasks();
        manager.createEpic("Съездить в центр", "нужно доехать до центра города", Status.NEW);
        manager.getAllTasks();
    }
}