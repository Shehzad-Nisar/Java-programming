package org.example.service.notificationService;


import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements NotificationService{
    @Override
    public void sendNotification(String msg) {
        System.out.println("SMS Notification: " + msg);
    }
}
