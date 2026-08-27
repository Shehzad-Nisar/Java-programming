package service.impl;

import domain.Account;
import domain.Customer;
import domain.Transaction;
import domain.Type;
import exceptions.AccountNotFoundException;
import exceptions.InsufficientAmountException;
import exceptions.ValidationException;
import repository.CustomerRepository;
import repository.TransactionRepository;
import service.BankService;
import repository.AccountRepository;
import util.Validation;

import java.time.LocalDateTime;
import java.util.*;

public class ConsoleServiceImp implements BankService {
    AccountRepository accountRepository = new AccountRepository();
    TransactionRepository transactionRepository = new TransactionRepository();
    CustomerRepository customerRepository = new CustomerRepository();


    // validations:
    private Validation<String> nameValidation = name ->{
        if(name == null|| name.isBlank()) throw new ValidationException("Proper name is required.");

    };

    private Validation<String> emailValidation = email ->{
        if(email == null|| !email.contains("@gmail.com")) throw new ValidationException("Proper email with @gmail.com in the end is required.");

    };

    private Validation<String> typeValidation = type ->{
        if(type!=) throw new ValidationException("Proper email with @gmail.com in the end is required.");

    };

    @Override
    public String openAccount(String name, String email, String accountType) {
        nameValidation.validation(name);
        emailValidation.validation(email);

        String customerid = UUID.randomUUID().toString();

        Customer c = new Customer(name,customerid,email);
        customerRepository.saved(c);

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
                .orElseThrow(()-> new AccountNotFoundException("Account not found!" + accountNumber));
        account.setBalance(account.getBalance() + amount);

        Transaction transaction = new Transaction(UUID.randomUUID().toString(),accountNumber, Type.DEPOSIT, LocalDateTime.now(),note,amount);

        transactionRepository.add(transaction);
    }


    // withdraw method:
    @Override
    public void withdraw(String accountNumber, Double amount) {
        Account account = accountRepository.findAccByNumber(accountNumber)
                .orElseThrow(()-> new AccountNotFoundException("Account Not Found!"+ accountNumber));

        if(account.getBalance().compareTo(amount)<0){
            throw new InsufficientAmountException("Insufficient balance.");
        }

        account.setBalance(account.getBalance() - amount);
        System.out.println("Withdraw " +amount + " rupees against Account number : " +accountNumber + " successfully." );


        Transaction transaction = new Transaction(UUID.randomUUID().toString(),accountNumber, Type.WITHDRAW, LocalDateTime.now(),"Deducted",amount);
        transactionRepository.add(transaction);
    }

    // method to transfer balance from one account to others.
    @Override
    public void transfer(String fromAccNum, String toAccNum, Double amount) {

        // validation 1 : to check both should not be same:
        if(fromAccNum.equals(toAccNum))
            throw new ValidationException("Cannot Transfer to your own account.");

        // Fetching account objects and also validate them.
        Account sender = accountRepository.findAccByNumber(fromAccNum)
                .orElseThrow(()-> new AccountNotFoundException("Sender Acc Not found! " +fromAccNum));

        Account receiver = accountRepository.findAccByNumber(toAccNum)
                .orElseThrow(()-> new AccountNotFoundException("Receiver Acc Not found! " + toAccNum));

        // validation 2 : to check sender should have that much balance:
        if(sender.getBalance().compareTo(amount)<0){
            throw new InsufficientAmountException("Insufficient Balance.");
        }

        // deduct amount from sender's balance.
        sender.setBalance(sender.getBalance() - amount);

        // add amount to receiver's account.
        receiver.setBalance(receiver.getBalance() + amount);

        // add transaction against sender's account.
        transactionRepository.add(new Transaction(UUID.randomUUID().toString(),sender.getAccountNumber(), Type.TRANSFER_OUT, LocalDateTime.now(),"Transferred amount.",amount));

        // add transaction against receiver's account.
        transactionRepository.add(new Transaction(UUID.randomUUID().toString(),receiver.getAccountNumber(), Type.TRANSFER_IN, LocalDateTime.now(),"Get amount.",amount));

    }

    @Override
    public List<Transaction> accountStatements(String account) {
        return transactionRepository.findByAccount(account)
                .stream()
                .sorted(Comparator.comparing( Transaction::getTimestamp))
                .toList();
    }

    @Override
    public List<Account> searchByName(String name) {

//        List<Account> result = new ArrayList<>();
//        for(Customer customer : customerRepository.findAll()){
//            if(customer.getName().toLowerCase().contains(query)){
//                result.addAll(accountRepository.findByCustId(customer.getId()));
//
//            }
//
//        }
//        result.sort(Comparator.comparing(Account::getAccountNumber));


        String query = (name == null)?" ": name.toLowerCase();

        return customerRepository.findAll().stream()
                .filter(c-> c.getName().toLowerCase().equals(query))
                .flatMap(c-> accountRepository.findByCustId(c.getId()).stream())
                .sorted(Comparator.comparing(Account::getAccountNumber))
                .toList();
    }


}
