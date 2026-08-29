package List;

import java.util.ArrayList;
import java.util.List;

public class BankAccount{
    private double balance ;
    private ArrayList<Transaction> transactions;

    public BankAccount(){
        transactions = new ArrayList<>();

    }
    //deposit

    public void deposit(double amount){
        if(amount<= 0){
            return;
        }

        balance+= amount;

        Transaction trans = new Transaction("deposited " , amount);
        transactions.add(trans);
    }

    public void withdraw(double amount){
        if(amount<=0 || amount>balance){
            System.out.println("Invalid Amount. Try again");
            return;
        }

        balance-=amount;
        Transaction trans = new Transaction("Withdrawl", amount);
        transactions.add(trans);




    }

    public void getBalance(){
        System.out.println("Your total balance is : " + balance);
    }


    public void getTrans(){
        for(int i =0 ; i< transactions.size(); i++){
            System.out.println("Transaction Type: " + transactions.get(i).getType() + "Transit Amount: "+ transactions.get(i).getAmount());
        }
    }

}

class Main{
    static void main() {
        BankAccount ac1 = new BankAccount();

        ac1.deposit(200);
        ac1.deposit(300);
        ac1.deposit(250);
        ac1.deposit(150);
        ac1.deposit(350);
        ac1.deposit(250);


        ac1.getBalance();
        ac1.withdraw(100);
        ac1.withdraw(150);
        ac1.withdraw(250);
        ac1.withdraw(600);

        ac1.getTrans();
        ac1.getBalance();





    }
}