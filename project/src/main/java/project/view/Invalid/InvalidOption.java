package project.view.Invalid;

import javax.swing.*;
import java.awt.*;

public class InvalidOption extends JFrame {
    JLabel invalidLabel;


    public InvalidOption(String message) {
        invalidLabel = new JLabel(message, SwingConstants.CENTER);

        invalidLabel.setBounds(0, 0, 200, 25);
        invalidLabel.setFont(new Font(null, Font.BOLD, 20));
        invalidLabel.setForeground(Color.RED);
        add(invalidLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLayout(new java.awt.BorderLayout());
		setVisible(true);
    }

    public static void main(String[] args) {
        new InvalidOption("Invalid Option");
    }
}
