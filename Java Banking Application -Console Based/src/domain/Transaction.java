package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionid;
    private String AccountNumber;
    private Type type;
    private LocalDateTime timestamp;
    private String note;
    private Double amount;


    public Transaction(String transactionid, String accountNumber, Type type, LocalDateTime timestamp, String note, double amount) {
        this.transactionid = transactionid;
        AccountNumber = accountNumber;
        this.type = type;
        this.timestamp = timestamp;
        this.note = note;
        this.amount = amount;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
