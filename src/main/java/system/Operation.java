package system;

import data.handling.DataStorage;
import data.record.AccountInformation;
import gui.window.LoginPanel;
import gui.window.UserInterface;
import system.process.AccountProcess;

public class Operation {
    UserInterface userInterface;
    AccountProcess accountProcess;
    DataStorage data;
    public Operation(){
        userInterface = new UserInterface();
        accountProcess = new AccountProcess();
        data = new DataStorage();
        createUser("Allynn", "Alvarico", "allynn91", "EchoAndDelta24");
    }
    public void createUser(String name, String surname, String username, String password){
        data.addCustomer(accountProcess.newAccountData(name, surname, username, password));
    }

}
