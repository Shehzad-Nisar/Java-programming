package myConstructors;

public class Transaction {

        long transactionId ;
        long senderWalletId;
        long receiverWalletId;
        double amount;
        String status;

   // brand-new transaction:

    Transaction(
            long transactionId,
            long senderWalletId,
            long receiverWalletId,
            double amount
    ){
        this.transactionId = transactionId;
        this.senderWalletId = senderWalletId;
        this.receiverWalletId = receiverWalletId;
        this.amount = amount;
        this.status = "Pending";

    }

    //when transaction is completed !!!!
    Transaction(
            long transactionId,
            long senderWalletId,
            long receiverWalletId,
            double amount,
            String status
    ){
        this.transactionId = transactionId;
        this.senderWalletId = senderWalletId;
        this.receiverWalletId = receiverWalletId;
        this.amount = amount;
        this.status = status;

    }

    void display(){
        System.out.println("Transaction Details:");
        System.out.println("Transaction ID:" + transactionId);
        System.out.println("Sender Wallet ID:" + senderWalletId);
        System.out.println("Receiver Wallet ID:" + receiverWalletId);
        System.out.println("Transferred Amount:" + amount);
        System.out.println("Transaction Status:" + status);
        System.out.println("=============================" );
    }


}
