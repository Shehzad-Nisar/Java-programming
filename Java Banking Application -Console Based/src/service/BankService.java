package service;

import domain.Account;
import domain.Transaction;

import java.util.List;

public interface BankService {

    void withdraw(String accountNumber, Double amount) ;

    String openAccount(String name, String email, String accountType);

    List<Account> listOfAccounts();

    void deposit(String accountNumber, Double amount, String note);

    void transfer(String fromAccNum, String toAccNum, Double amount);

    List<Transaction> accountStatements(String account);
}



