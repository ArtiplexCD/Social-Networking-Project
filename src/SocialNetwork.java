package src;

import java.util.LinkedHashMap;
import java.util.TreeMap;

// Holds all the Users
public class SocialNetwork {
    private TreeMap<String, User> users;

    public SocialNetwork() {

    }

    // Reads the file and inserts date into the map
    private void loadFromFile(String fileName) {

    }

    public int calculateDensity() {
        return -1;
    }

    public User findMostFollowedUser() {
        for (int i = 0; i < users.size(); i++) {

        }
        return null;
    }

    public User findMostFollowingUser() {
        return null;
    }

    // Returns the number of people two degrees separated from a given user.
    public int getTwoDegreesOfSeparation(String userName) {
        return -1;
    }

    public int calculateMedianFollowers() {
        return -1;
    }

    public User findBestMessagePropagator() {
        return null;
    }
}
