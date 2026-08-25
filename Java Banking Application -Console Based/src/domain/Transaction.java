package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private String AccountNumber;
    private String type;
    private LocalDateTime timestamp;
    private String note;
    private double amount;


    public Transaction(String id, String accountNumber, String type, LocalDateTime timestamp, String note, double amount) {
        this.id = id;
        AccountNumber = accountNumber;
        this.type = type;
        this.timestamp = timestamp;
        this.note = note;
        this.amount = amount;
    }
}
