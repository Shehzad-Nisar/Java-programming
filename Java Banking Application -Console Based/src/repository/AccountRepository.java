package repository;

import domain.Account;
import domain.Transaction;

import java.util.*;

public class AccountRepository {
    private final Map<String, Account> accountsByNumbers= new HashMap<>();

    public void save(Account account){
        accountsByNumbers.put(account.getAccountNumber(), account);
    }


    public List<Account> findAll() {
        return new ArrayList<>(accountsByNumbers.values());
    }


    public Optional<Account> findAccByNumber(String accNumber) {
        return Optional.ofNullable(accountsByNumbers.get(accNumber));
    }



    public List<Account> findByCustId(String customerId) {

        //create an account list to store same data;
        List<Account> result = new ArrayList<>();
        for (Account c : accountsByNumbers.values()){
            if(c.getCustomerid().equals(customerId)){
                result.add(c);
            }
        }
        return result;
    }
}
