package com.bill.config;

import com.bill.service.UserService;
import com.bill.serviceImpl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * JAVA装配
 */
@Configuration
public class AppConfig1 {

    @Bean
    @Primary
    public UserService add(){
        System.out.println("Java配置添加用户");
        return new UserServiceImpl();
    }
}
