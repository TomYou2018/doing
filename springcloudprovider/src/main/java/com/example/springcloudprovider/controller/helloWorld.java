package com.example.springcloudprovider.controller;


import javafx.application.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import java.util.List;

@RestController
public class helloWorld {


   private DiscoveryClient client;

    @RequestMapping("/")
    public String home() {

        List<ServiceInstance> instances = client.getInstances("hello-service");
        return "Hello world2";
    }
//    public static void main(String[] args) {
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
//    }
}
