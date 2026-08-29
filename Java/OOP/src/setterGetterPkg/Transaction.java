package setterGetterPkg;

public class Transaction {
    private long transactionId;
    private long senderWalletId;
    private long receiverWalletId;
    private double amount;
    private String transactionStatus = "Pending";


    //constructor for brand-new transaction:

    Transaction(long transactionId, long senderWalletId, long receiverWalletId, double amount){

        if(amount<=0||senderWalletId==receiverWalletId){
            System.out.println("Invalid transaction.");
            return;
        }

        this.transactionId = transactionId;
        this.senderWalletId = senderWalletId;
        this.receiverWalletId = receiverWalletId;
        this.amount = amount;
    }


    // all getter functions:
    long getTransactionId(){
        return transactionId;
    }
    long getSenderWalletId(){
        return senderWalletId;
    }
    long getReceiverWalletId(){
        return receiverWalletId;
    }
    double getAmount(){
        return amount;
    }
    String getTransactionStatus(){
        return transactionStatus;
    }

    // methods to change states of Transaction:

    void markCompleted(){
        transactionStatus = "Completed!";
    }

    void markFailed(){
        transactionStatus = "Failed!";

    }


}
