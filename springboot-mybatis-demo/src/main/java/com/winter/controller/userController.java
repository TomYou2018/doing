package com.winter.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("/user")

public class userController {

    @ResponseBody
    @RequestMapping(value = "/add")
    String home() {
        return "Hello ,spring boot!";
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
