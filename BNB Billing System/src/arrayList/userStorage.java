
package arrayList;

import java.util.ArrayList;

public class userStorage {
    private ArrayList<User> users;

    public userStorage() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // user not found
    }

    public boolean verifyPassword(User user, String password) {
        return user.getPassword().equals(password);
    }
}

