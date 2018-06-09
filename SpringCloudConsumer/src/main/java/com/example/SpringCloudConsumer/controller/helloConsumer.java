package com.example.SpringCloudConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class helloConsumer {

  //  @Autowired
    private RestTemplate restTemplate= new RestTemplate();

    @GetMapping("/")
    public String sayHello() {
       //String something = restTemplate.getForEntity("http://hello-service/",helloConsumer.class).getBody().toString();
       RestTemplate something = restTemplate.getForEntity("http://localhost:8080",helloConsumer.class)..getBody();
       if (something!= "") {
           return something;
       }

        return "wrong！";
    }
}
