package repository;

import domain.Account;

import java.util.*;

public class AccountRepository {
    private final Map<String, Account> accountsByNumbers= new HashMap<>();

    public void save(Account account){
        accountsByNumbers.put(account.getAccountNumber(), account);
    }


    public List<Account> findAll() {
        return new ArrayList<>(accountsByNumbers.values());

    }
}
