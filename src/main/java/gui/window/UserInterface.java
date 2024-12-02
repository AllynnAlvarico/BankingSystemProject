package gui.window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton register = registerPanel.getBtnRegister();
        JButton cancel = registerPanel.getBtnCancel();
        JButton clear = registerPanel.getBtnClear();
        if(e.getSource() == register){
            System.out.println("Hello Bitch!");
        } else if (e.getSource() == cancel) {
            this.dispose();
        } else if (e.getSource() == clear){
            registerPanel.clearFields();
        }
    }
    RegisterPanel registerPanel;
    LoginPanel loginPanel;
    final int x = 750, y = 400;
    //initialize block{}
    {
        setTitle("Banking System Application");

    }

    public UserInterface(){


        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        initialisedLoginPanel();

        pack();
        setVisible (true);

        registerPanel.getBtnRegister().addActionListener(this);
        registerPanel.getBtnCancel().addActionListener(this);
        registerPanel.getBtnClear().addActionListener(this);

        this.setLocation(x, y);
    }
    public void initialisedLoginPanel(){
        loginPanel = new LoginPanel();
        getContentPane().add (loginPanel.getPanel());
    }

    public void initialisedRegisterPanel() {
        registerPanel = new RegisterPanel();
        getContentPane().add (registerPanel.getPanel());
    }
}
