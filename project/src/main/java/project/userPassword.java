package project;

import java.util.HashMap;

public class userPassword {
	private HashMap<String, String> loginInfo = new HashMap<>();
	
	public userPassword() {
		
	}
	
	public void registerUserPW(String user, String pw) {
		loginInfo.put(user, pw);
	}
	
	protected HashMap<String, String> getLoginInfo() {
		return this.loginInfo;
	}
}
