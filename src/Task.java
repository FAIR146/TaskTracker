public class Task {
    private String name;
    private String bio;
    private final int id;
    private static int idGenerator = 0;
    private String status;
    public Task() {
       id = idGenerator;
       idGenerator++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public static void setIdGenerator(int idGenerator) {
        Task.idGenerator = idGenerator;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
