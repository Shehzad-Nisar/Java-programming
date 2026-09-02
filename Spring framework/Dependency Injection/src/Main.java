import Notification.EmailNotification;
import Notification.SMSNotification;
import Notification.WhatsAppNotification;

public class Main {


    static void main() {
        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        WhatsAppNotification app = new WhatsAppNotification();

        //order service :
        OrderService order = new OrderService(email);
        order.sendNotification("Order Placed.");

        OrderService order1 = new OrderService(sms);
        order1.sendNotification("Order Placed.");
        OrderService order2 = new OrderService(app);
        order2.sendNotification("Order Placed.");



    }
}
