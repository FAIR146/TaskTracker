public class SubTask extends Task {
    private final Epic epic;
    public SubTask (Epic epic) {
        this.epic = epic;
    }

    @Override
    public String toString() {
        return "SubTask{" + System.lineSeparator() +
                "epic=" + epic.getId() + " " + epic.getName()+ " " + System.lineSeparator() +
                "id=" + getId() + System.lineSeparator() +
                "name=" + getName() + "id=" + getId() + System.lineSeparator() +
                "description=" + getDescription() + "id=" + getId() + System.lineSeparator() +
                "status=" + getStatus() + "id=" + getId() + System.lineSeparator() +
                '}';
    }
}
