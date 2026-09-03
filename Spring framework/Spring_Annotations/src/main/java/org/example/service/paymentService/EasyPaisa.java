package org.example.service.paymentService;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EasyPaisa implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using EasyPaisa.");    }
}
