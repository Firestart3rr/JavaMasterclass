package Section7_OOP_Part1_Inheritance;

import java.math.BigDecimal;

public class Account {

    private String accountNumber;
    private BigDecimal accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("56789", BigDecimal.valueOf(2.5), "Default name", "Default address", "Default phone");
        System.out.println("Empty contructor called");
    }

    public Account(String accountNumber, BigDecimal accountBalance, String customerName, String customerEmail, String customerNumber) {
        System.out.println("Account contructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        email = customerEmail;
        phoneNumber = customerNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("99999", BigDecimal.valueOf(100.55), customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public BigDecimal depositFunds(BigDecimal funds) {
        accountBalance = accountBalance.add(funds);
        return accountBalance;
    }

    public BigDecimal withdrawfunds(BigDecimal funds) {
        if (accountBalance.subtract(funds).signum() < 0) {
            return accountBalance;
        }
        if (accountBalance.subtract(funds).signum() > 0) {
            accountBalance = accountBalance.subtract(funds);
        }
        return accountBalance;
    }

    public void printInfo() {
        System.out.println("AccountNumber: " + accountNumber + " " +
                "AccountBalance: " + accountBalance + " " +
                "customerName: " + customerName + " " +
                "email: " + email + " " +
                "phoneNumber: " + phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
