package BANK_APPLICATION_DEV;

public class BankApplication {
    private String customerName;
    private String customerAddress;
    private long phoneNumber;
    private double balance;

    // constructor-------------------------------------------------------------------------------------------------------------------
    public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("invalid initial balance! Balance set to 0");
        }
        System.out.println("account created succesfully");
    }

    // getters------------------------------------------------------------------------------------------------------------------------

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    // setters----------------------------------------------------------------------------------------------------------------------

    public void setCustomerName(String name) {
        customerName = name;
    }

    public void setCustomerAddress(String address) {
        customerAddress = address;
    }

    public void setPhoneNumber(long numb) {
        phoneNumber = numb;
    }

    // methods---------------------------------------------------------------------------------------------
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("invalid amount!");
        } else {
            balance += amount;
            System.out.println("Amount deposited succesfully");
            System.out.println("Updated Balance :" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else if (balance < amount) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Succesfull!");
            System.out.println("Remaining Balance :" + balance);
        }
    }

    public void showBalance() {
        System.out.println("Current Balance:" + balance);
    }
}
