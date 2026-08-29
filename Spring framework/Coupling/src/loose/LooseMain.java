package loose;

public class LooseMain {
    static void main() {
        JazzCashPayment jazzCashPayment = new JazzCashPayment();
        loose.EasyPaisaPayment easyPaisaPayment = new EasyPaisaPayment();

        PaymentService pay = new PaymentService(jazzCashPayment);
        pay.payService(10000);
        PaymentService pay2 = new PaymentService(easyPaisaPayment);
        pay2.payService(20000);
    }
}
