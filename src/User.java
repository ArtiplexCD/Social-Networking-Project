package src;

import java.util.LinkedHashSet;

// Holds all the information about User
public class User {
    private final String name;
    private LinkedHashSet<User> following;
    private LinkedHashSet<User> followers;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFollowCount() {
        return following.size();
    }

    public int getFollowerCount() {
        return followers.size();
    }

    public boolean followingUser(User findingUser) {
        return following.contains(findingUser);
    }

    public boolean followerUser (User findingUser) {
        return followers.contains(findingUser);
    }

    public void addToFollowing(User newFollowing) {
        following.add(newFollowing);
    }

    public void addTooFollower(User newFollower) {
        followers.add(newFollower);
    }
}
