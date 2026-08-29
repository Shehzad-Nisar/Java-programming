package loose;

public class JazzCashPayment implements PaymentMethod {

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using JazzCash.");
    }
}
