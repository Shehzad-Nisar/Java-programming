public class Methods{

    //Transaction validation method
    public static boolean isValidTransaction(double balance, double amount){
        return amount>0 && amount<=balance;
    }

    // New balance method
    public static double newBalance(double balance , double amount){
        return balance-amount;
    }


    static void main() {
        double balance = 50000;
        double amount = 13794;

        if(isValidTransaction(balance, amount)){
            double newBalance = newBalance(balance,amount);
            System.out.println("Transaction successful");
            System.out.println("Old balance: " + balance);
            System.out.println("Transferred: " + amount);
            System.out.println("New balance: " + newBalance);
        }

    }
}