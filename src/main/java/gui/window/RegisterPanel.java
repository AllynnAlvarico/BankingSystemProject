package gui.window;

import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JPanel {

    private JTextField txtName, txtSurname, txtUsername, txtEmailAddress, txtContact, txtPassportNumber;
    private JTextField txtAddress1, txtAddress2, txtTownCity, txtState, txtZipCode;
    private JPasswordField passwordField;
    private JComboBox cmbAccountType;
    private JButton btnRegister, btnCancel, btnClear;

    public RegisterPanel(){
        String[] cmbAccountTypeItems = {"Checking Account", "Saving Account", "Business Account"};

        JLabel lblName = new JLabel("Name:");
        txtName = new JTextField (20);
        JLabel lblSurname = new JLabel("Surname:");
        txtSurname = new JTextField (5);
        JLabel lblAddress1 = new JLabel("Address 1:");
        txtAddress1 = new JTextField (5);
        JLabel lblAddress2 = new JLabel("Address 2:");
        txtAddress2 = new JTextField (5);
        JLabel lblTownCity = new JLabel("Town/City:");
        txtTownCity = new JTextField (5);
        JLabel lblState = new JLabel("State:");
        txtState = new JTextField (5);
        JLabel lblZipCode = new JLabel("Zip Code:");
        txtZipCode = new JTextField (5);
        JLabel lblUserName = new JLabel("User Name:");
        txtUsername = new JTextField (5);
        JLabel lblPassword = new JLabel("Password:");
        passwordField = new JPasswordField (5);
        JLabel lblEmail = new JLabel("Email:");
        txtEmailAddress = new JTextField (5);
        JLabel lblContact = new JLabel("Contact:");
        txtContact = new JTextField (5);
        JLabel lblAccountType = new JLabel("Account Type");
        cmbAccountType = new JComboBox (cmbAccountTypeItems);
        JLabel lblPassportNumber = new JLabel("Passport Number:");
        txtPassportNumber = new JTextField (5);
        btnRegister = new JButton ("Register");
        btnCancel = new JButton ("Cancel");
        btnClear = new JButton ("Clear");

        setPreferredSize (new Dimension(530, 400));
        setLayout (null);

        add (lblName);
        add (txtName);
        add (lblSurname);
        add (txtSurname);
        add (lblAddress1);
        add (txtAddress1);
        add (lblAddress2);
        add (txtAddress2);
        add (lblTownCity);
        add (txtTownCity);
        add (lblState);
        add (txtState);
        add (lblZipCode);
        add (txtZipCode);
        add (lblUserName);
        add (txtUsername);
        add (lblPassword);
        add (passwordField);
        add (lblEmail);
        add (txtEmailAddress);
        add (lblContact);
        add (txtContact);
        add (lblAccountType);
        add (cmbAccountType);
        add (lblPassportNumber);
        add (txtPassportNumber);
        add (btnRegister);
        add (btnCancel);
        add (btnClear);

        lblName.setBounds (15, 45, 60, 25);
        txtName.setBounds (95, 45, 150, 25);
        lblSurname.setBounds (15, 75, 60, 25);
        txtSurname.setBounds (95, 75, 150, 25);
        lblAddress1.setBounds (15, 140, 70, 25);
        txtAddress1.setBounds (95, 140, 150, 25);
        lblAddress2.setBounds (15, 170, 70, 25);
        txtAddress2.setBounds (95, 170, 150, 25);
        lblTownCity.setBounds (15, 200, 70, 25);
        txtTownCity.setBounds (95, 200, 100, 25);
        lblState.setBounds (15, 230, 70, 25);
        txtState.setBounds (95, 230, 100, 25);
        lblZipCode.setBounds (15, 260, 70, 25);
        txtZipCode.setBounds (95, 260, 100, 25);
        lblUserName.setBounds (270, 45, 70, 25);
        txtUsername.setBounds (360, 45, 150, 25);
        lblPassword.setBounds (270, 75, 70, 25);
        passwordField.setBounds (360, 75, 150, 25);
        lblEmail.setBounds (15, 310, 60, 25);
        txtEmailAddress.setBounds (95, 310, 150, 25);
        lblContact.setBounds (15, 340, 70, 25);
        txtContact.setBounds (95, 340, 150, 25);
        lblAccountType.setBounds (270, 140, 100, 25);
        cmbAccountType.setBounds (360, 140, 150, 25);
        lblPassportNumber.setBounds (270, 195, 120, 25);
        txtPassportNumber.setBounds (270, 220, 150, 25);
        btnRegister.setBounds (285, 310, 100, 55);
        btnCancel.setBounds (390, 310, 100, 55);
        btnClear.setBounds (390, 280, 100, 25);
    }

    public JPanel getPanel(){
        return this;
    }
    public JButton getBtnRegister(){
        return btnRegister;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }
    public JButton getBtnClear(){
        return btnClear;
    }

    public String getTxtName() {
        return txtName.getText();
    }

    public String getTxtSurname() {
        return txtSurname.getText();
    }

    public String getTxtUsername() {
        return txtUsername.getText();
    }

    public String getTxtEmailAddress() {
        return txtEmailAddress.getText();
    }

    public String getTxtContact() {
        return txtContact.getText();
    }

    public String getTxtPassportNumber() {
        return txtPassportNumber.getText();
    }

    public String getTxtAddress1() {
        return txtAddress1.getText();
    }

    public String getTxtAddress2() {
        return txtAddress2.getText();
    }

    public String getTxtTownCity() {
        return txtTownCity.getText();
    }

    public String getTxtState() {
        return txtState.getText();
    }

    public String getTxtZipCode() {
        return txtZipCode.getText();
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JComboBox getCmbAccountType() {
        return cmbAccountType;
    }

    public void clearFields(){
        txtName.setText("");
        txtSurname.setText("");
        txtUsername.setText("");
        txtEmailAddress.setText("");
        txtContact.setText("");
        txtPassportNumber.setText("");
        txtAddress1.setText("");
        txtAddress2.setText("");
        txtTownCity.setText("");
        txtState.setText("");
        txtZipCode.setText("");
        passwordField.setText("");
    }
}
