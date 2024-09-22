package ListSOLID_POO.exe17_social_network;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users;

    public UserManager() {
        this.users = new HashMap<>();
    }

    public void registerUser(String name) {
        if (!users.containsKey(name)) {
            User user = new User(name);
            users.put(name, user);
            System.out.println("User " + name + " successfully registered!");
        } else {
            System.out.println("User " + name + " already exists!");
        }
    }

    public User findUser(String name) {
        return users.get(name);
    }

    public void displayAllUsers() {
        users.keySet().forEach(System.out::println);
    }
}
