package polymorphismBankAcc;



public class BankAccMain {

    static void main() {
        BankAccount b1 = new CurrentAccount(111,"Shehzad Nisar",10000,5000);
        b1.withdraw(12000);

        BankAccount b2 = new SavingAccount(222,"Mushahid Hussain",100000,5);


        SavingAccount b3 = new SavingAccount(333,"Muhammad Ashraf",50000,5);
        b2.checkBalance();
        b3.addInterest();
        b2.checkBalance();
    }
}
