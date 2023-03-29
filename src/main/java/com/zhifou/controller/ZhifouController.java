package com.zhifou.controller;

import com.zhifou.domain.UserServiceDTO;
import com.zhifou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zhifou")
public class ZhifouController{
    @Autowired
    UserService userService;

    @PostMapping("/test")
    @ResponseBody
    public void test(){
        System.out.println("test");

    }
    @PostMapping("/login")
    @ResponseBody
    public void login(@RequestBody UserServiceDTO userServiceDTO){
        userService.userLogin(userServiceDTO);

    }
    @PostMapping("/register")
    @ResponseBody
    public void register(@RequestBody UserServiceDTO userServiceDTO){
        System.out.println("test");

    }
}
