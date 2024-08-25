package src;

// Will control all the tasks
public class TaskManager {
    private SocialNetwork socialNetwork;

    public TaskManager() {
        socialNetwork = new SocialNetwork();
    }

    public void executeAllTasks() {
        socialNetwork.calculateDensity();
    }
}
