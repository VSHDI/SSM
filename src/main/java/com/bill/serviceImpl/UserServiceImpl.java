package com.bill.serviceImpl;

import com.bill.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void sayHi() {
        System.out.println("hello");
    }
}
