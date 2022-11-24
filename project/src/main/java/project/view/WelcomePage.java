package project.view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jfree.chart.ChartPanel;

public class WelcomePage {
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel();
	private static WelcomePage welcomePage = new WelcomePage();

	private WelcomePage() {
		welcomeLabel.setBounds(0, 0, 200, 25);
		welcomeLabel.setFont(new Font(null, Font.PLAIN, 20));
		welcomeLabel.setText("Welcome!");
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public void addChart(ChartPanel cp) {
		frame.add(cp);
	}

	public void update(ChartPanel cp) {
		frame.add(cp);
	}

	public static WelcomePage getInstance() {
		return welcomePage;
	}
}
