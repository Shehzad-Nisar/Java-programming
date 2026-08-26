package service.impl;

import service.BankService;

import java.util.UUID;

public class ConsoleServiceImp implements BankService {
    @Override
    public String openAccount(String name, String email, String accountType) {

        String customerid = UUID.randomUUID().toString();

        // change later -> 10+1 -> ACC11---
        String accountNumber = UUID.randomUUID().toString();

        return "";
    }
}
