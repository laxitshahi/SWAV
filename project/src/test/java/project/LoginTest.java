package project;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import project.model.MaintainUser;
import project.model.User;
import project.model.UserPassword;

class LoginTest {

    @Test
    void loginTest() throws Exception {
        User user1 = new User("kai", 911, "kai@gmail.com", "ENG");
        
        UserPassword userPW = new UserPassword();
        assertTrue(userPW.checkUser(user1) == 0);
    }
    
    @Test 
    void loginTest2() throws Exception {
        User user1 = new User("testing", 911, "kai@gmail.com", "wrong");
        
        UserPassword userPW = new UserPassword();
        assertTrue(userPW.checkUser(user1) == 1);
    }
    
    @Test 
    void loginTest3() throws Exception {
        User user1 = new User("testing", 911, "kai@gmail.com", "testing");
        
        UserPassword userPW = new UserPassword();
        assertTrue(userPW.checkUser(user1) == 2);
    }
    
    @Test
    void registerTest() throws Exception {
        User user1 = new User("kai", 911, "kai@gmail.com", "ENG");
        
        UserPassword userPW = new UserPassword();
        
        
        assertTrue(userPW.checkUser(user1) == 0);
        userPW.registerUser("kai", "911", "kai@gmail.com", "ENG");
        assertTrue(userPW.checkUser(user1) == 2);
    }
    
    @Test
    void maintainUpdateTest() throws Exception {
        MaintainUser maintain = new MaintainUser();
        
        //Create new user
        User newUser1 = new User("t10", 3, "t10@yorku.ca", "11141");
        ArrayList<User> users = new ArrayList<>();
        users.add(newUser1);
        
        maintain.update(users);
        
        //Load from csv to users array list
        ArrayList<User> usersLoaded =  maintain.load();
        
        boolean found = false;
        for(User u : usersLoaded) {
            if (u.getName().equals(newUser1.getName()) && u.getPassword().equals(newUser1.getPassword())) {
                found = true;
            }
        }
        assertTrue(found);
    }
    
    @Test
    void maintainLoadTest() throws Exception {
        MaintainUser maintain = new MaintainUser();
        
        //Create new user
        User newUser1 = new User("t10", 3, "t10@yorku.ca", "11141");
        ArrayList<User> users = new ArrayList<>();
//        users.add(newUser1);
        
        maintain.update(users);
        
        //Load from csv to users array list
        ArrayList<User> usersLoaded =  maintain.load();
        
        boolean found = false;
        for(User u : usersLoaded) {
            if (u.getName().equals(newUser1.getName()) && u.getPassword().equals(newUser1.getPassword())) {
                found = true;
            }
        }
        assertFalse(found);
    }

}
