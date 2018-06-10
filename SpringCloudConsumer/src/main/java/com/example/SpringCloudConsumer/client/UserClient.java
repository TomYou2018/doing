package com.example.SpringCloudConsumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hello-service")
public interface UserClient {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getS();

}