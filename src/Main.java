public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addEpic("Поездка", "Съездить на озеро");
        manager.addSubTask(0,"Собрать вещи","Проснуться, взять портфель", Status.NEW);
        System.out.println(manager.getEpicById(0));

    }
}