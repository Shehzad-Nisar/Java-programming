package objClasses;

public class BankAccount {

        String accId;
        String accHolder;
        double balance;

        void deposit(double amount){
            balance+=amount;

        }

        void withdraw(double amount){
            if (amount > balance) {
                return ;
            }

            balance-=amount;

        }

        // show details about acc:
        void display(){
            System.out.println("Account Holder : " + accHolder);
            System.out.println("Account ID     : " + accId);
            System.out.println("Balance        : " + balance);
            System.out.println("-------------------------");
        }

    }

