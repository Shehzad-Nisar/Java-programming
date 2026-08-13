package inheritanceBankAcc;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public SavingAccount(long accountNumber,String accountHolder, double accountBalance,double interestRate){

        super(accountNumber,accountHolder,accountBalance);
        this.interestRate = interestRate;

    }

    //add interest rate:
    public void addInterest(){


        System.out.println("Balance before interest:" + super.getAccountBalance());
        double interest = (interestRate*super.getAccountBalance())/100;
        super.depositBalance(interest);
        System.out.println("Balance after interest:" + super.getAccountBalance());

    }


}

class MainSaving{
    static void main() {
        SavingAccount s1 = new SavingAccount(2222,"zia khan",10000,5);
        s1.addInterest();
    }

}