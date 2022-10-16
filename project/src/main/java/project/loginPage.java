package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginPage implements ActionListener {
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("login");
	JButton registerButton = new JButton("register");
	JButton registerNowButton = new JButton("register now");
	JTextField userField = new JTextField();
	JPasswordField pwField = new JPasswordField();
	JLabel userLabel = new JLabel("user: ");
	JLabel pwLabel = new JLabel("password: ");
	JLabel msgLabel = new JLabel();
	
	HashMap<String, String> loginInfo = new HashMap<>();
	
	
	public loginPage(HashMap<String, String> loginInfo) {
		this.loginInfo = loginInfo;
		
		userLabel.setBounds(50, 100, 75, 25);
		pwLabel.setBounds(50, 150, 75, 25);
		
		userField.setBounds(125, 100, 200, 25);
		pwField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		
		registerButton.setBounds(225, 200, 100, 25);
		registerButton.addActionListener(this);
		registerButton.setFocusable(false);
		
		msgLabel.setBounds(125, 250, 250, 35);
		
		frame.add(userLabel);
		frame.add(pwLabel);
		frame.add(msgLabel);
		frame.add(userField);
		frame.add(pwField);
		frame.add(loginButton);
		frame.add(registerButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == registerButton) {
			msgLabel.setText("");
			
			userField.setText("");
			pwField.setText("");
			loginButton.setVisible(false);
			registerButton.setVisible(false);
			
			
			registerNowButton.setBounds(150, 200, 150, 25);
			registerNowButton.addActionListener(this);
			registerNowButton.setFocusable(false);
			frame.add(registerNowButton);
		} 
		if(e.getSource() == loginButton) {
			String user = userField.getText();
			String pw = pwField.getText();
			msgLabel.setText("");
			
			if(this.loginInfo.containsKey(user)) {
				if(this.loginInfo.get(user).equals(pw)) {
					msgLabel.setText("login succesful");
					frame.dispose();
					welcomePage wPage = new welcomePage(user);
				} else {
					msgLabel.setText("either user or password incorrect");
				}
			} else {
				msgLabel.setText("you must register");
			}
		}
		if(e.getSource() == registerNowButton) {
			loginInfo.put(userField.getText(), pwField.getText()); // TODO is this adding the user and pw to the loginInfo in this class or in userPassword class? probably this class
			
			userField.setText("");
			pwField.setText("");
			registerNowButton.setVisible(false);
			loginButton.setVisible(true);
			registerButton.setVisible(true);
			
		}
	}

}