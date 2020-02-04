package com.bill.controller;

import com.bill.entity.TbUser;
import com.bill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    @RequestMapping(value = {"main"}, method = RequestMethod.GET)
    public String login1() {
        return "main";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String email, @RequestParam(required = true) String password) {
        TbUser user = userService.login(email, password);
        if (user != null) {
            return "main";
        }
        return "error";
    }
}