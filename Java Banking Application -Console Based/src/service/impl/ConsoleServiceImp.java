package service.impl;

import domain.Account;
import service.BankService;
import repository.AccountRepository;

import java.util.UUID;

public class ConsoleServiceImp implements BankService {
    AccountRepository accountRepository = new AccountRepository();
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

    private String getAccountNumber() {
        int size = accountRepository.findAll().size() + 1;

        return String.format("AC%06d" ,size);
    }

}
