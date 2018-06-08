package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;

@RestController
public class hello {

    @RequestMapping("/")
    public String home() {

        //List<ServiceInstance> instances = client.getInstances("hello-service");
        return "Hello worldx";
    }
}
