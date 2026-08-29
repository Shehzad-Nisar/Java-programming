package intermediateStream.topicwise.sorted;

public class Transaction {
    private String transId;
    private String transType;
    private double amount;

    public Transaction(String transId, String transType, double amount){
        this.transId = transId;
        this.transType = transType;
        this.amount = amount;
    }

    public String getTransId(){
        return transId;
    }

    public String getTransType(){
        return transType;
    }

    public double getAmount(){
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transId='" + transId + '\'' +
                ", transType='" + transType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
