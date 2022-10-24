package project.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
        pwLabel.setBounds(50, 150, 75, 25);
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


            registerNowButton.setBounds(150, 300, 150, 25);
            registerNowButton.addActionListener(this);
            registerNowButton.setFocusable(false);
            frame.add(idLabel);
            frame.add(emailLabel);
            frame.add(idField);
            frame.add(emailField);
            frame.add(registerNowButton);
        }
        if (e.getSource() == loginButton) {
            String name = userField.getText();
            String password = pwField.getText();
            String id = idField.getText();
            String email = emailField.getText();

            msgLabel.setText("");

            // TODO add id and email compatibility
            if (this.userPassword.checkUser(new User(name, 0, "email", password)) == 2) {
                msgLabel.setText("login succesful");
                frame.dispose();
                welcomePage wPage = new welcomePage(name);
            } else if (this.userPassword.checkUser(new User(name, 0, "email", password)) == 1) {

                msgLabel.setText("either user or password incorrect");
            } else if (this.userPassword.checkUser(new User(name, 0, "email", password)) == 0) {
                msgLabel.setText("you must register");
            }
        }
        if (e.getSource() == registerNowButton) {
            String name = userField.getText();
            String password = pwField.getText();
            String id = idField.getText();
            String email = emailField.getText();

            //TODO add id and email compatibility
            this.userPassword.registerUser(name, "0", "email", password); // TODO is this adding the user and pw to the loginInfo in this class or in userPassword class? probably this class

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