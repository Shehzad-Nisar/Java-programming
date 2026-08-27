package service;

import domain.Account;

import java.util.List;

public interface BankService {

    void withdraw(String accountNumber, Double amount) ;

    String openAccount(String name, String email, String accountType);

    List<Account> listOfAccounts();

    void deposit(String accountNumber, Double amount, String note);
}


