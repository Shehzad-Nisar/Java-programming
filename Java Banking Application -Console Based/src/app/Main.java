package app;

import java.util.Scanner;

class Main{

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;
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
            System.out.println("CHOICE: " + choice);

            switch (choice){
                case 1 -> openAccount(scanner);
                case 2 -> deposit(scanner);
                case 3 -> withdraw(scanner);
                case 4 -> transfer(scanner);
                case 5 -> accountStatement(scanner);
                case 6 -> listOfAccounts(scanner);
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

    private static void openAccount(Scanner scanner) {
    }

    private static void deposit(Scanner scanner) {
    }

    private static void withdraw(Scanner scanner) {
    }

    private static void transfer(Scanner scanner) {
    }

    private static void accountStatement(Scanner scanner) {
    }

    private static void listOfAccounts(Scanner scanner) {
    }

    private static void searchAccountByName(Scanner scanner) {
    }

}