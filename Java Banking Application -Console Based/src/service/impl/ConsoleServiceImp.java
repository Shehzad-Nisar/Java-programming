package service.impl;

import domain.Account;
import domain.Transaction;
import domain.Type;
import repository.TransactionRepository;
import service.BankService;
import repository.AccountRepository;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ConsoleServiceImp implements BankService {
    AccountRepository accountRepository = new AccountRepository();
    TransactionRepository transactionRepository = new TransactionRepository();



    @Override
    public String openAccount(String name, String email, String accountType) {

        String customerid = UUID.randomUUID().toString();

        // change later -> 10+1 -> ACC11---
        String accountNumber = getAccountNumber();

        Account account = new Account(accountNumber,accountType,0,customerid);

        //save to repository in account repository
        accountRepository.save(account);

        return accountNumber;
    }


    // this method shows list of accounts
    @Override
    public List<Account> listOfAccounts() {
        return accountRepository.findAll().stream()
                .sorted(Comparator.comparing(Account::getAccountNumber))
                .toList();
    }

    //deposit method
    @Override
    public void deposit(String accountNumber, Double amount, String note) {
        Account account = accountRepository.findAccByNumber(accountNumber)
                .orElseThrow(()-> new RuntimeException("Account not found!"));
        account.setBalance(account.getBalance() + amount);

        Transaction transaction = new Transaction(UUID.randomUUID().toString(),accountNumber, Type.TRANSFER_IN, LocalDateTime.now(),note,amount);

        transactionRepository.add(transaction);
    }
    @Override
    public void withdraw(String accountNumber, Double amount) {
        Account account = accountRepository.findAccByNumber(accountNumber)
                .orElseThrow(()-> new RuntimeException("Account Not Found!"));

        account.setBalance(account.getBalance() - amount);

        Transaction transaction = new Transaction(UUID.randomUUID().toString(),accountNumber, Type.TRANSFER_OUT, LocalDateTime.now(),"Deducted",amount);
        transactionRepository.add(transaction);


    }

    private String getAccountNumber() {
        int size = accountRepository.findAll().size() + 1;

        return String.format("AC%06d" ,size);
    }

}
