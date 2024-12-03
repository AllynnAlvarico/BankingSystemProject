package data.record;
import java.util.LinkedList;
public class Customer {
    private LinkedList<String> customerIdLists;
    private String customerId;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String address1;
    private String address2;
    private String town;
    private String state;
    private String zipcode;
    private String email;
    private String contact;
    private String passportNumber;
    private static int getTotalCustomer;
    private int generatedId;
    {
        getTotalCustomer += 1;
        customerIdLists = new LinkedList<String>();
    }
    public Customer(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.customerId = String.valueOf(getGeneratedId());
    }
    public Customer(String name, String surname, String username, String password, String address1, String address2, String town, String state, String zipcode, String email, String contact, String passportNumber) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;
        this.contact = contact;
        this.passportNumber = passportNumber;
        this.customerId = String.valueOf(getGeneratedId());
    }

    public String setGeneratedId() {
        generatedId = (int) (Math.random() * 999999) + 100000;
        return String.valueOf(generatedId);
    }

    public void setCustomerId(){
        String tempId = setGeneratedId();
        if (customerIdLists.isEmpty())customerIdLists.add(tempId);

        do{


            if (!customerIdLists.contains(tempId));
//
//            this.customerId = stringId;
        }while (customerIdLists.contains(generatedId));
    }

    public int getGeneratedId() {
        return generatedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public static int getGetTotalCustomer() {
        return getTotalCustomer;
    }

}
