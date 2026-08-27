package repository;

import domain.Transaction;

import java.util.*;

public class TransactionRepository {
    private final Map<String, List<Transaction>> txByNumber = new HashMap<>();

    public void add(Transaction transaction){
        txByNumber.computeIfAbsent(transaction.getAccountNumber(),
                k-> new ArrayList<>()).add(transaction);


    }


    public List<Transaction> findByAccount(String account) {
        return new ArrayList<>(txByNumber.getOrDefault(account, Collections.emptyList()));
    }
}
