package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	private static JLabel userLabel;
	private static JLabel pswrdLabel;
	private static JTextField userText;
	private static JPasswordField pswrdText;
	private static JButton button;
	private static JLabel correct;
	
	public static void main(String[] args) {
		
		// declare and initialize frame and panel
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		// configure frame
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // TODO may need to put as last line
		frame.add(panel);
		
		panel.setLayout(null);
		
		
		// create labels for user and password 
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		pswrdLabel = new JLabel("Password");
		pswrdLabel.setBounds(10, 50, 80, 25);
		panel.add(pswrdLabel);
		
		
		// create textfields for user and password
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		pswrdText = new JPasswordField();
		pswrdText.setBounds(100, 50, 165, 25);
		panel.add(pswrdText);
		
		
		// create button for login
		button = new JButton("login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		
		// create "correct" when user inputs correct user and pswrd
		correct = new JLabel("");
		correct.setBounds(10, 110, 300, 25);
		panel.add(correct);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = userText.getText();
		String pswrd = pswrdText.getText();
		
		System.out.println(user + ", " + pswrd);
		
		// add dataset for registered user and password then check if user and password match
		if(user.equals("song") && pswrd.equals("wong123")) {
			correct.setText("login succesful");
		}
		else {
			correct.setText("either user or password is incorrect");
		}
		
	}
}
