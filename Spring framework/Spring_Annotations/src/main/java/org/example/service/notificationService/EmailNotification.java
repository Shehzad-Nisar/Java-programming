package org.example.service.notificationService;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Email Notification :" + msg);
    }
}
