package com.example.springcloudprovider.controller;


import javafx.application.Application;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import java.util.List;
import org.apache.logging.log4j.Logger;

@RestController
public class helloWorld {

    private final Logger logger = LogManager.getLogger();
    private DiscoveryClient client;

    @RequestMapping("/")
    public String home() {

        List<ServiceInstance> instances = client.getInstances("hello-service");
        logger.info("test");
        System.out.println("test");

        for (int i = 0; i < instances.size(); i++) {
            logger.info("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }

        return "Hello world2";
    }
//    public static void main(String[] args) {
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
//    }
}
