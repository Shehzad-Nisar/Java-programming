package org.example;

import org.example.config.AppConfig;
import org.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserController controller = context.getBean(UserController.class);
        controller.createUser("shehzad");
        controller.createUser("shehzad ali");
        controller.allUser();
    }
}