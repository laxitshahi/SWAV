package project.view.Invalid;

import javax.swing.*;
import java.awt.*;

public class InvalidOption extends JFrame {
    JLabel invalidLabel;


    public InvalidOption(String message) {
       // setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        invalidLabel = new JLabel(message, SwingConstants.CENTER);

        invalidLabel.setBounds(0, 0, 600, 50);
        invalidLabel.setFont(new Font(null, Font.BOLD, 20));
        invalidLabel.setForeground(Color.BLACK);
        add(invalidLabel);

		setSize(600, 100);
		setLayout(new java.awt.BorderLayout());
		setVisible(true);
    }

    public static void main(String[] args) {
        new InvalidOption("Invalid Option");
    }
}
