package gui.window;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private JLabel lblUsername;
    private JTextField txtUserName;
    private JLabel lblPassword;
    private JPasswordField passwordField;
    private JButton jcomp5;
    private JButton jcomp6;
    private JButton btnForgotPassword;
    private JButton btnRegister;

    public LoginPanel(){
        //construct components
        lblUsername = new JLabel ("Username");
        txtUserName = new JTextField (5);
        lblPassword = new JLabel ("Password:");
        passwordField = new JPasswordField (5);
        jcomp5 = new JButton ("Login");
        jcomp6 = new JButton ("Exit");
        btnForgotPassword = new JButton ("Forgot Password");
        btnRegister = new JButton ("Register");

        setPreferredSize (new Dimension(530, 400));
        setLayout (null);

        add (lblUsername);
        add (txtUserName);
        add (lblPassword);
        add (passwordField);
        add (jcomp5);
        add (jcomp6);
        add (btnForgotPassword);
        add (btnRegister);

        lblUsername.setBounds (50, 50, 80, 25);
        txtUserName.setBounds (150, 50, 165, 25);
        lblPassword.setBounds (50, 90, 80, 25);
        passwordField.setBounds (150, 90, 165, 25);
        jcomp5.setBounds (150, 130, 80, 25);
        jcomp6.setBounds (235, 130, 80, 25);
        btnForgotPassword.setBounds (150, 165, 165, 25);
        btnRegister.setBounds (150, 195, 165, 25);
    }
    public JPanel getPanel(){
        return this;
    }
}
