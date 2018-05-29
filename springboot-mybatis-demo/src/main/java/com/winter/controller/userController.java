package com.winter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.winter.service.UserService;
import com.winter.model.User;

@Controller
@EnableAutoConfiguration
@RequestMapping("/user")

public class userController {
    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/dsp")
    String test(){
        return "test";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(userController.class, args);
        //运行之后在浏览器中访问：http://localhost:8080/hello
    }
}
