package setterGetterPkg;

public class TransactionMain {

    static void main() {
        Transaction t1 = new Transaction(1122,1001,1010,5000);
        Transaction t2 = new Transaction(1123,1002,1023,10000);
        Transaction t3 = new Transaction(1123,1002,1002,-10000);

        System.out.println("Transaction Id: "+ t1.getTransactionId());
        System.out.println("Sender Wallet Id: " + t1.getSenderWalletId());
        System.out.println("Receiver Wallet Id: " + t1.getReceiverWalletId());
        System.out.println("Transferred Amount: "+ t1.getAmount());
        System.out.println("Transaction Status: " + t1.getTransactionStatus());
        System.out.println("===After Processing Payment===");
        t1.markCompleted();
        System.out.println("Transaction Status: " + t1.getTransactionStatus());

        System.out.println("=============================");

        System.out.println("Transaction Id: "+ t2.getTransactionId());
        System.out.println("Sender Wallet Id: " + t2.getSenderWalletId());
        System.out.println("Receiver Wallet Id: " + t2.getReceiverWalletId());
        System.out.println("Transferred Amount: "+ t2.getAmount());
        System.out.println("Transaction Status: " + t2.getTransactionStatus());
        System.out.println("===After Processing Payment===");
        t2.markFailed();
        System.out.println("Transaction Status: " + t2.getTransactionStatus());





    }
}
