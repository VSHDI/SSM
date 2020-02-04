package com.bill.service;

import com.bill.entity.TbUser;

public interface UserService {
    void sayHi();
    TbUser login(String username,String password);
}
