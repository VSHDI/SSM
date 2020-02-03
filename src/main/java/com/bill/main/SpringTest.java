package com.bill.main;

import com.bill.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.sayHi();
    }
}
