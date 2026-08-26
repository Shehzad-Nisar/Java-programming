package domain;

public class Account {
    private String accountNumber;
    private String accountType;
    private Double balance;
    private String customerid;

    public Account(String accountNumber, String accountType, double balance, String customerid) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.customerid = customerid;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
}
