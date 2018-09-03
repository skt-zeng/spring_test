package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index1")
    public String showIndex(){
        System.out.println("经过控制器");
        return "index1";
    }
    @RequestMapping("/test")
    public String showTest(){
        System.out.println("经过控制器");
        return "test";
    }

}
