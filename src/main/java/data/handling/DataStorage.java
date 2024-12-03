package data.handling;

import data.record.AccountInformation;
import system.Operation;

import java.util.HashMap;
import java.util.Map;

public class DataStorage {
    private final Map<String, AccountInformation> systemData;
    public DataStorage(){
        systemData = new HashMap<>();
    }
    public void addCustomer(AccountInformation byVal_customer){
        int generatedAccountNumber = (int) (Math.random() * 999999) + 111111;
        systemData.put(String.valueOf(generatedAccountNumber), byVal_customer);
    }
    public Map<String, AccountInformation> getSystemData() {
        return systemData;
    }

}
