package loose;

public class EasyPaisaPayment implements PaymentMethod {

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using EasyPaisa.");
    }
}
