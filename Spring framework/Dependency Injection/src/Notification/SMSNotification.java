package Notification;

public class SMSNotification implements Notification{
    @Override
    public void send(String msg) {
        System.out.println("SMS Notification : " +msg );
    }
}
