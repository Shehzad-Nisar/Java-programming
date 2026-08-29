package polymorphismBankAcc;

public class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double accountBalance;

    //BankAccount constructor:

    public BankAccount(long accountNumber,String accountHolder, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        //validation for balance:

        if(accountBalance>=0){
            this.accountBalance = accountBalance;
        }else {
            this.accountBalance = 0;
            System.out.println("Invalid initial amount.");
        }
        System.out.println("parent constructor run");

    }


    //Method for deposit balance:::
    public void depositBalance(double amount){
        if(amount<=0){
            System.out.println("Invalid Amount");
            return ;
        }

        accountBalance += amount;
        System.out.println("You deposited "+ amount + " PKR successfully.");

    }

    //withdraw method:
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("You entered invalid Amount.");
            return ;
        }
        if(amount>accountBalance){
            System.out.println("Insufficient Amount in Your account for this withdrawal.");
            return;
        }

        accountBalance-=amount;
        System.out.println("You withdraw "+ amount + " PKR successfully.");

    }

    //saving withdrawal
    protected void deductBalance(double amount){
        accountBalance-=amount;
    }


    //check balance:
    public void checkBalance(){
        System.out.println("Account balance is : "+ accountBalance);

    }

    public double getAccountBalance(){
        return accountBalance;
    }
}
