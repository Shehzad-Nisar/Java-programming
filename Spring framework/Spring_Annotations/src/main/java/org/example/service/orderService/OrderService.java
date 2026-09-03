package org.example.service.orderService;

import org.example.service.notificationService.NotificationService;
import org.example.service.paymentService.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private NotificationService notification;
    private PaymentService payment;

    /*public OrderService(@Qualifier("emailNotification") NotificationService notification, @Qualifier("jazzCash") PaymentService payment) {
        this.notification = notification;
        this.payment = payment;
    }*/

    public OrderService(NotificationService notification, PaymentService payment) {
        this.notification = notification;
        this.payment = payment;
    }

    public void orderPlaced(double amount, String msg){
        System.out.println("Order created.");
        payment.pay(amount);
        notification.sendNotification(msg);
    }
}
