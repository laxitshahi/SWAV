package project.view;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class welcomePage {

    public welcomePage(String user) {
        //Get screen size
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        //Set up frame


        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setBounds(dimension.width / 2, 20, 200, 25);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 20));
        welcomeLabel.setText("Welcome, " + user + "!");

        JLabel intro = new JLabel();
        JLabel desc = new JLabel();
        intro.setText("Follow the directions below to get started.");
        desc.setText("1. Select data type \r\n 2. Select Country \r\n 3. Select Graphs");


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(dimension);
        frame.setVisible(true);
        //Add to frame
        frame.add(welcomeLabel);
        frame.add(intro);
        frame.add(desc);
    }
}
