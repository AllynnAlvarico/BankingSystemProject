package data.handling;

import data.record.AccountInformation;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class DataStorage {
    private final Map<String, AccountInformation> systemData;
    private final LinkedList<String> usernameLists;
    public DataStorage(){
        systemData = new HashMap<>();
        usernameLists = new LinkedList<>();
    }
    public void addCustomer(AccountInformation byVal_customer){
        int generatedAccountNumber = (int) (Math.random() * 999999) + 111111;
        systemData.put(String.valueOf(generatedAccountNumber), byVal_customer);

    }
    public boolean isUsernameUnique(AccountInformation byVal_customer){
        return usernameLists.contains(byVal_customer.getUsername());
    }
    public void addUsernameToList(){
    }
    public LinkedList<String> getUsernameLists(){return usernameLists;}
    public Map<String, AccountInformation> getSystemData() {
        return systemData;
    }

}
