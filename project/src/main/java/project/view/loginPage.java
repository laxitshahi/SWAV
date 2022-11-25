package project.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sun.tools.javac.Main;
import project.model.*;

public class loginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("login");
    JButton registerButton = new JButton("register");
    JButton registerNowButton = new JButton("register now");
    JTextField userField = new JTextField();
    JTextField idField = new JTextField();
    JTextField emailField = new JTextField();
    JPasswordField pwField = new JPasswordField();
    JLabel userLabel = new JLabel("user: ");
    JLabel idLabel = new JLabel("id: ");
    JLabel emailLabel = new JLabel("email: ");
    JLabel pwLabel = new JLabel("password: ");
    JLabel msgLabel = new JLabel();
    private userPassword userPassword;

    public loginPage() throws Exception {
        this.userPassword = new userPassword();

        userLabel.setBounds(50, 100, 75, 25);
        pwLabel.setBounds(50, 150, 100, 25);
        idLabel.setBounds(50, 200, 75, 25);
        emailLabel.setBounds(50, 250, 75, 25);

        userField.setBounds(125, 100, 200, 25);
        pwField.setBounds(125, 150, 200, 25);
        idField.setBounds(125, 200, 200, 25);
        emailField.setBounds(125, 250, 200, 25);

        loginButton.setBounds(125, 300, 100, 25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        registerButton.setBounds(225, 300, 100, 25);
        registerButton.addActionListener(this);
        registerButton.setFocusable(false);

        msgLabel.setBounds(125, 350, 250, 35);

        frame.add(userLabel);
        frame.add(pwLabel);
        frame.add(idLabel);
        frame.add(emailLabel);
        frame.add(msgLabel);

        frame.add(userField);
        frame.add(pwField);
        frame.add(idField);
        frame.add(emailField);

        frame.add(loginButton);
        frame.add(registerButton);
        frame.add(registerNowButton);

        idField.setVisible(false);
        emailField.setVisible(false);
        idLabel.setVisible(false);
        emailLabel.setVisible(false);
        registerNowButton.setVisible(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // listen for action and check source of trigger
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            msgLabel.setText("");

            userField.setText("");
            pwField.setText("");
            idField.setText("");
            emailField.setText("");

            idLabel.setVisible(true);
            emailLabel.setVisible(true);
            
            idField.setVisible(true);
            emailField.setVisible(true);
            loginButton.setVisible(false);
            registerButton.setVisible(false);
            registerNowButton.setVisible(true);


            registerNowButton.setBounds(150, 300, 150, 25);
            registerNowButton.addActionListener(this);
            registerNowButton.setFocusable(false);
        }
        if (e.getSource() == loginButton) {
            // Change this once testing is done else login will work w/o auth
            userField.setText("testing"); pwField.setText("testing");

            String name = userField.getText();
            String password = String.valueOf(pwField.getPassword());

            //Add id/email login in later if time
            String id = idField.getText();
            String email = emailField.getText();
            msgLabel.setText("");

            /*
             * @Note
             * 2: User registered + correct credentials
             * 1: User registered + incorrect credentials
             * 0: User not registered
             */
            if (this.userPassword.checkUser(new User(name, 0, "email", password)) == 2) {
                msgLabel.setText("Login successful!");
                frame.dispose();
//                WelcomePage wPage = WelcomePage.getInstance();
                MainUI mainUI = MainUI.getInstance();
            } else if (this.userPassword.checkUser(new User(name, 0, "email", password)) == 1) {
                msgLabel.setText("Please check your username and password.");
            } else if (this.userPassword.checkUser(new User(name, 0, "email", password)) == 0) {
                msgLabel.setText("You must register");
            }
        }
        if (e.getSource() == registerNowButton) {
            String name = userField.getText();
            String password = pwField.getText();
            String id = idField.getText();
            String email = emailField.getText();

            //TODO add id and email compatibility
            this.userPassword.registerUser(name, id, email, password); // TODO is this adding the user and pw to the loginInfo in this class or in userPassword class? probably this class

            userField.setText("");
            pwField.setText("");
            idField.setText("");
            emailField.setText("");

            idField.setVisible(false);
            emailField.setVisible(false);

            idLabel.setVisible(false);
            emailLabel.setVisible(false);
            
            registerNowButton.setVisible(false);
            loginButton.setVisible(true);
            registerButton.setVisible(true);
        }
    }

}