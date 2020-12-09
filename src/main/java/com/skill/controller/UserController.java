package com.skill.controller;

import com.skill.domain.User;
import com.skill.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/skill")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(path = "/test")
    @ResponseBody
    public User test(Integer id){
        System.out.println("请求过来了");
        return userService.selectOne(id);
    }
}
