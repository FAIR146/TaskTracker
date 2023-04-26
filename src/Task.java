public class Task {
    private int id;
    private String name;
    private String description;
    private Status status;


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus (Status status) {
        this.status = status;
    }

    public void setId (int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }
    @Override
    public String toString() {
        return "Task" + System.lineSeparator() +
                "name=" + getName() + System.lineSeparator() +
                "id=" + getId() + System.lineSeparator() +
                "description=" + getDescription() + System.lineSeparator() +
                "status=" + getStatus() + System.lineSeparator();
    }
}
