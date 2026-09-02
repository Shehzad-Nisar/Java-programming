package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanCreation bean = (BeanCreation) context.getBean("myBean");
        bean.hello();

    }
}
