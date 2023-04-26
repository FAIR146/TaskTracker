public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.createTask("Школа", "нужно прийти в школу",Status.NEW);
        manager.getAllTasks();
        manager.createTask("Съездить в центр", "нужно доехать до центра города", Status.NEW);
        manager.getAllTasks();
    }
}