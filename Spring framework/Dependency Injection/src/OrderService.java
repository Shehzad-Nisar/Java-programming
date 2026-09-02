import Notification.Notification;

public class OrderService {
    private Notification notification;

    public OrderService(Notification notification){
        this.notification = notification;
    }

    public void sendNotification(String msg){
        notification.send(msg);
    }
}
