package project.view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class welcomePage {
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	
	public welcomePage(String user) {
		welcomeLabel.setBounds(0, 0, 200, 25);
		welcomeLabel.setFont(new Font(null, Font.PLAIN, 20));
		welcomeLabel.setText("Welcome, " + user + "!");
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
