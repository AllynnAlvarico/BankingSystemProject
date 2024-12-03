package gui.window;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private JTextField txtUserName;
    private JPasswordField passwordField;
    private JButton btnLogin, btnExit, btnRegister, btnForgotPassword;

    public LoginPanel(){
        JLabel lblUsername = new JLabel("Username");
        txtUserName = new JTextField (5);
        JLabel lblPassword = new JLabel("Password:");
        passwordField = new JPasswordField (5);
        btnLogin = new JButton ("Login");
        btnExit = new JButton ("Exit");
        btnForgotPassword = new JButton ("Forgot Password");
        btnRegister = new JButton ("Register");

        setPreferredSize (new Dimension(420, 280));
        setLayout (null);

        add (lblUsername);
        add (txtUserName);
        add (lblPassword);
        add (passwordField);
        add (btnLogin);
        add (btnExit);
        add (btnForgotPassword);
        add (btnRegister);

        lblUsername.setBounds (50, 50, 80, 25);
        txtUserName.setBounds (150, 50, 165, 25);
        lblPassword.setBounds (50, 90, 80, 25);
        passwordField.setBounds (150, 90, 165, 25);
        btnLogin.setBounds (150, 130, 80, 25);
        btnExit.setBounds (235, 130, 80, 25);
        btnForgotPassword.setBounds (150, 165, 165, 25);
        btnRegister.setBounds (150, 195, 165, 25);
    }

    public String getTxtUserName() {
        return txtUserName.getText();
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public JButton getBtnRegister() {
        return btnRegister;
    }
    public JButton getBtnExit() {
        return btnExit;
    }
    public JButton getBtnForgotPassword() {
        return btnForgotPassword;
    }
    public JPanel getPanel(){
        return this;
    }
}
