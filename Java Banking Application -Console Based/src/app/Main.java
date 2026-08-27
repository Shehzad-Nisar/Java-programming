package app;

import service.BankService;
import service.impl.ConsoleServiceImp;

import java.util.Scanner;

class Main{

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        BankService bankService = new ConsoleServiceImp();
        System.out.println("WellCome to Console Based Bank");


        while (running){
            System.out.println("""
                1) Open Account
                2) Deposit
                3) Withdraw
                4) Transfer
                5) Account Statement
                6) List of Accounts
                7) Search Account by name
                8) Exit
                """);
            System.out.println("CHOOSE:");
            int choice = scanner.nextInt();
             scanner.nextLine();
            System.out.println("CHOICE: " + choice);

            switch (choice){
                case 1 -> openAccount(scanner,bankService);
                case 2 -> deposit(scanner,bankService);
                case 3 -> withdraw(scanner,bankService);
                case 4 -> transfer(scanner);
                case 5 -> accountStatement(scanner);
                case 6 -> listOfAccounts(scanner,bankService);
                case 7 -> searchAccountByName(scanner);
                case 8 -> {
                    running = false;
                    System.out.println("Thank you");
                }
                default -> {
                    running = false ;
                    System.out.println("Please enter a valid option (1-8).");
                }

            }
        }

    }

    private static void openAccount(Scanner scanner, BankService bankService) {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.println("Enter your Email: ");
        String email = scanner.nextLine().trim();

        System.out.println("Account Type (SAVING/CURRENT): ");
        String accountType = scanner.nextLine().trim().toUpperCase();

        System.out.println("Initial amount (optional, blank for 0): ");
        String balanceStr = scanner.nextLine().trim();
        Double balance = Double.valueOf(balanceStr); // convert string amount into Double amount:

        String accountNumber = bankService.openAccount(name,email,accountType);
        if(balance>0){
            bankService.deposit(accountNumber,balance,"Initial deposit.");
        }
        System.out.println("Account created successfully.");
        System.out.println("Your Account Number is :" + accountNumber);
        System.out.println("THANKS FOR CHOOSING US !");


    }

    private static void deposit(Scanner scanner, BankService bankService) {
        System.out.println("Account Number :");
        String accountNumber = scanner.nextLine().trim();
        System.out.println("Amount :");
        Double amount = Double.valueOf(scanner.nextLine().trim());
        System.out.println("Want to add a note :");
        String note = scanner.nextLine().trim();

        bankService.deposit(accountNumber,amount,note);
        System.out.println("Deposited " +amount + " rupees against Account number : " +accountNumber + " successfully." );

    }

    private static void withdraw(Scanner scanner,BankService bankService) {
        System.out.println("Account Number :");
        String accountNumber = scanner.nextLine().trim();
        System.out.println("Amount :");
        Double amount = Double.valueOf(scanner.nextLine().trim());
        bankService.withdraw(accountNumber,amount);
        System.out.println("Withdraw " +amount + " rupees against Account number : " +accountNumber + " successfully." );



    }

    private static void transfer(Scanner scanner) {
    }

    private static void accountStatement(Scanner scanner) {
    }

    private static void listOfAccounts(Scanner scanner, BankService bankService) {
        bankService.listOfAccounts().forEach(account-> {
            System.out.println("Account no: " + account.getAccountNumber()+ " | "+"Account Type: " + account.getAccountType() + " | "+"Account Balance: " + account.getBalance());
        });
    }

    private static void searchAccountByName(Scanner scanner) {
    }

}