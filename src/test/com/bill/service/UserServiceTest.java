package com.bill.service;

import com.bill.config.AppConfig1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= AppConfig1.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSayHi(){
        userService.sayHi();
    }
}