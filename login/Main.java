package model;

public class Main {

	public static void main(String[] args) {
		userPassword userPW = new userPassword();
		
		loginPage logInPage = new loginPage(userPW.getLoginInfo());
		
	}

}
