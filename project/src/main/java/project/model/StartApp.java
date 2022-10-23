package project.model;

import project.view.loginPage;

public class StartApp {

    public static void start() {
        userPassword userPW = new userPassword();
        loginPage logInPage = new loginPage(userPW.getLoginInfo());
    }
}
