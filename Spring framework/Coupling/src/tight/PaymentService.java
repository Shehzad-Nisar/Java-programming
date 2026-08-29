package tight;

public class PaymentService {

    public void makeJazzPayment(double amount){
        JazzCashPayment p = new JazzCashPayment();

        p.pay(amount);
    }  public void makeEasyPaisaPayment(double amount){
        EasyPaisa p2 = new EasyPaisa();

        p2.payment(amount);

    }
}
