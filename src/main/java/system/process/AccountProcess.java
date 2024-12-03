package system.process;

import data.handling.DataStorage;
import data.record.*;

public class AccountProcess {
    AccountInformation customerAccount;
    public AccountProcess(){
        customerAccount = new AccountInformation();
    }

    public AccountInformation newAccountData(String byVal_name, String byVal_surname, String byVal_username, String byVal_password){
        return new AccountInformation(byVal_name, byVal_surname, byVal_username, byVal_password);
    }


}
