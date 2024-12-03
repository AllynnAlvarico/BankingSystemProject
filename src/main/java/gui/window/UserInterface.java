package gui.window;

import system.Operation;
import system.process.VerificationProcess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton login = loginPanel.getBtnLogin();
        JButton exit = loginPanel.getBtnExit();
        JButton forgot = loginPanel.getBtnForgotPassword();
        JButton register = loginPanel.getBtnRegister();

        JButton add = registerPanel.getBtnRegister();
        JButton cancel = registerPanel.getBtnCancel();
        JButton clear = registerPanel.getBtnClear();

        if (e.getSource() == exit) this.dispose();
        else if (e.getSource() == register) initialisedRegisterPanel();
        else if (e.getSource() == add) System.out.println("Hello Bitch!");
        else if (e.getSource() == cancel) initialisedLoginPanel();
        else if (e.getSource() == clear) registerPanel.clearFields();
        else if (e.getSource() == login) verificationProcess.verifyUser();
    }
    RegisterPanel registerPanel;
    LoginPanel loginPanel;
    VerificationProcess verificationProcess;
    JPanel panel;
    final int loginHeight = 280, loginWidth = 420;
    final int regHeight = 420, regWidth = 540;
    final int x = 750, y = 400;
    //initialize block{}
    {
        setTitle("Banking System Application");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }

    public UserInterface(){

        registerPanel = new RegisterPanel();
        loginPanel = new LoginPanel();
        verificationProcess = new VerificationProcess();


        initialisedLoginPanel();

        pack();
        setVisible (true);

        loginPanel.getBtnLogin().addActionListener(this);
        loginPanel.getBtnExit().addActionListener(this);
        loginPanel.getBtnForgotPassword().addActionListener(this);
        loginPanel.getBtnRegister().addActionListener(this);

        registerPanel.getBtnRegister().addActionListener(this);
        registerPanel.getBtnCancel().addActionListener(this);
        registerPanel.getBtnClear().addActionListener(this);

        setSize(loginWidth, loginHeight);
        this.setLocation(x, y);

    }
    public void initialisedLoginPanel(){
        panel = loginPanel.getPanel();
        initPanel(panel, registerPanel.getPanel(), loginWidth, loginHeight);
    }
    public void initialisedRegisterPanel() {
        panel = registerPanel.getPanel();
        initPanel(panel, loginPanel.getPanel(), regWidth, regHeight);
    }
    public void swapPanels(JPanel panelA, JPanel panelB){
        panelA.setVisible(true);
        panelB.setVisible(false);
    }
    public void initPanel(JPanel panel, JPanel byRefPanel, int byVal_width, int byVal_height){
        getContentPane().add (panel);
        swapPanels(panel, byRefPanel);
        this.setPreferredSize(new Dimension(byVal_width, byVal_height));
        pack();
    }
    public String getTextUserName(){
        return loginPanel.getTxtUserName();
    }


}
