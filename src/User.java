package src;

// Holds all the information about User
public class User {
    private String name;
    private int following;
    private int followers;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFollowing() {
        return following;
    }

    public int getFollowers() {
        return followers;
    }
}
