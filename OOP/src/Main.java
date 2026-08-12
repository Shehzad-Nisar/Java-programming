//Bank Account class:
 class BankAccount{
    String accId;
    String accHolder;
    double balance;

    void deposit(double amount){
        balance+=amount;

    }

    void withdraw(double amount){
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




void main() {
    BankAccount user1 = new BankAccount();
    user1.accHolder = "Baber Ali";
    user1.accId = "11222bbbb";
    user1.deposit(10000);
    user1.withdraw(4000);
    user1.display();


    BankAccount user2 = new BankAccount();
    user2.accHolder = "Shehzad Nisar";
    user2.accId = "112776bbbb";
    user2.deposit(20000);
    user2.display();
    BankAccount user3 = new BankAccount();
    user3.accHolder = "Sadaqat Hussain";
    user3.accId = "1jj776bb44";
    user3.deposit(45000);
    user3.withdraw(40000);
    user3.display();



}