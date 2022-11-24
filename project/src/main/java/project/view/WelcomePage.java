package project.view;

import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jfree.chart.ChartPanel;

public class WelcomePage extends JFrame{
	JLabel welcomeLabel = new JLabel();
	private static WelcomePage welcomePage = new WelcomePage();

	private WelcomePage() {
		welcomeLabel.setBounds(0, 0, 200, 25);
		welcomeLabel.setFont(new Font(null, Font.PLAIN, 20));
		welcomeLabel.setText("Welcome!");
		
		add(welcomeLabel, BorderLayout.PAGE_START);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLayout(new java.awt.GridLayout());
		setVisible(true);
	}

	public void addChart(ChartPanel cp, String borderLayout) {
		add(cp, borderLayout);
		// pack();
		// validate();
	}

	public static WelcomePage getInstance() {
		return welcomePage;
	}
}
