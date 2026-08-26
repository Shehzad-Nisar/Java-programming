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
}
