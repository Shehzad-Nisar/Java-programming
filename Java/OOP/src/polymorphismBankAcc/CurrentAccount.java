package polymorphismBankAcc;

public class CurrentAccount extends BankAccount {
    private double overDraftLimit ;

    public CurrentAccount(long accountNumber,String accountHolder, double accountBalance,double overDraftLimit){
        super(accountNumber,accountHolder,accountBalance);

        this.overDraftLimit = overDraftLimit;
    }


    //withdrawal method (special):

    @Override
    public void withdraw(double amount){
        double balanceBef = super.getAccountBalance();

        // amount should not be 0 or -ive.
        if(amount<=0){
            System.out.println("Invalid amount.!");
            return;
        }

        // amount should not exceed balanceBef+ overdraftLimit:
        if(amount> (balanceBef + overDraftLimit)){
            System.out.println("Withdrawal amount exceeds the Limit + Balance.");
            return;
        }

        super.deductBalance(amount);

        if(amount > balanceBef){
            double loanAmount = amount - balanceBef;
            overDraftLimit -= loanAmount;

            System.out.println("Withdrawal successful.");
            System.out.println("You take loan of " + loanAmount + "PKR.");
            System.out.println("OverDraftLimit : " + overDraftLimit + "PKR.");

        }else {
            System.out.println(
                    "You withdrew " + amount + " PKR successfully."
            );
        }



    }
}


