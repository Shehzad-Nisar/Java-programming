package org.example.config;

import org.example.db.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
    @Bean(initMethod = "init" , destroyMethod = "destroy")
    public Database database(){
        return new Database();
    }



}
