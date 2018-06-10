package com.example.SpringCloudConsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name= "hello-service")
public interface helloRemote {
//    @RequestMapping(value = "/")
//    public String hello(@RequestParam(value = "") String name);
}