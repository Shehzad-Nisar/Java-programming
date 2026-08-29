package tight;

public class TightMain {

    static void main() {
        PaymentService p = new PaymentService();
        p.makeJazzPayment(5000);


        PaymentService p2 = new PaymentService();
        p2.makeEasyPaisaPayment(10000);
    }

}
