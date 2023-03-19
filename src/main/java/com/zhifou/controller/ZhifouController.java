package com.zhifou.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zhifou")
public class ZhifouController{
    @PostMapping("/test")
    @ResponseBody
    public void test(){
        System.out.println("test");

    }
}
