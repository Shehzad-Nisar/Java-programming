package BankAcc;



public class BankAcc {
    private String accHolder;
    private String accNum;
    private double accBalance ;


    public BankAcc(String accHolder, String accNum, double accBalance){
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.accBalance = accBalance;
    }

    public void getBalance(){
        System.out.println(accBalance);
    }


    // deposit method...

    public void deposit(double amount) throws Exception{
        if(amount<=0)
            throw new Exception("Deposit amount should >>0:");
        accBalance+=amount;
    }

    public void withdraw(double amount ) throws Exception{
        if(amount<=0)
            throw new Exception("Deposit amount should >>0:");
        if(amount>accBalance)
            throw new Exception("Insufficient Balance.");

        accBalance-=amount;
    }

    public void transfer(BankAcc receiver , double amount){
        try {
            this.withdraw(amount);
        } catch (Exception e) {

            throw new RuntimeException(e);
        }

        try {
            receiver.deposit(amount);

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

class Main{
    static void main() {
        BankAcc A = new BankAcc("shehzad nisar","1122hh",5000);
        BankAcc B = new BankAcc("nisar hussain","1122hh",10000);

        System.out.print("Account A balance before: ");A.getBalance();
        System.out.print("Account B balance before: ");B.getBalance();


        A.transfer(B,4000);
        System.out.print("Account A balance After: ");A.getBalance();
        System.out.print("Account B balance After: ");B.getBalance();


//        try {
//            A.deposit(1111);
//        }catch (Exception e){
//            System.out.println("Exception occured:"+ e.getMessage());
//        }
//
//        A.getBalance();
//        try {
//            A.withdraw(99);
//        }catch (Exception e){
//            System.out.println("Exception occured:"+ e.getMessage());
//        }
//        A.getBalance();
//

    }
}
