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
                case 0:
                    running = false;
                    System.out.println("THANK YOU!");
                    break;
            }
        }

    }

}