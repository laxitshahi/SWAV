package project.model;

import project.controller.MaintainUser;

import java.util.ArrayList;

public class userPassword {
    private MaintainUser maintainUser = new MaintainUser();
    private ArrayList<User> users;

    public userPassword() throws Exception {
        this.users = this.maintainUser.load();
    }

    public int checkUser(User other) {
        int found = 0;

        for (User i : this.users) {
            if (i.getName().equals(other.getName())) {
                found = 1;
                if (i.getPassword().equals(other.getPassword())) {
                    found = 2;
                }
            }
        }
        return found;
    }

    public void registerUser(String name, String id, String email, String pw) {
        this.users.add(new User(name, Integer.parseInt(id), email, pw));

        try {
            this.maintainUser.update(this.users);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
