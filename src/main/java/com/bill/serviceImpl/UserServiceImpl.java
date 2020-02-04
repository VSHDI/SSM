package com.bill.serviceImpl;

import com.bill.dao.UserDao;
import com.bill.entity.TbUser;
import com.bill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void sayHi() {
        System.out.println("hello");
    }

    @Override
    public TbUser login(String username, String password) {
        TbUser user = userDao.findByEmail(username);
        if (user != null) {
            if (password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
