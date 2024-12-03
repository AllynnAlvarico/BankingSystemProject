package data.record;

public class AccountInformation extends Customer{

    private short accountNumber, cardPin;
    private String accountType, cardNumber, tierLevel;
    private double balance;

    public AccountInformation(){
        super("", "", "", "");
    }
    public AccountInformation(String name, String surname, String username, String password) {
        super(name, surname, username, password);
    }
    public AccountInformation(String name, String surname, String username, String password, String address1, String address2, String town, String state, String zipcode, String email, String contact, String passportNumber, short accountNumber, short cardPin, String accountType, String cardNumber) {
        super(name, surname, username, password, address1, address2, town, state, zipcode, email, contact, passportNumber);
        this.accountNumber = accountNumber;
        this.cardPin = cardPin;
        this.accountType = accountType;
        this.cardNumber = cardNumber;
    }

    public short getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(short accountNumber) {
        this.accountNumber = accountNumber;
    }

    public short getCardPin() {
        return cardPin;
    }

    public void setCardPin(short cardPin) {
        this.cardPin = cardPin;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getTierLevel(){
        return tierLevel;
    }
    public void setTierLevel(String tierLevel){
        this.tierLevel = tierLevel;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
