package org.example;

import org.example.service.BeanLifeCycle;
import org.example.service.orderService.OrderService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//       OrderService order = context.getBean(OrderService.class);
//       order.orderPlaced(5000.0,"Order Placed");

       BeanLifeCycle bean = context.getBean(BeanLifeCycle.class);
       bean.cleanup();





    }
}

