package repository;

import domain.Transaction;

import java.util.HashMap;
import java.util.Map;

public class TransactionRepository {
    private final Map<String, Transaction> txByNumber = new HashMap<>();

    public void add(Transaction transaction){
        txByNumber.put(transaction.getAccountNumber(),transaction);
    }


}
