package loose;

public class PaymentService {
    PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void payService(double amount){
        paymentMethod.makePayment(amount);
    }



}
