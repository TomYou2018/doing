package com.example.SpringCloudConsumer.controller;

import com.example.SpringCloudConsumer.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@FeignClient(name= "hello-service")

public class helloConsumer {

  @Autowired
  RestTemplate restTemplate;


    @GetMapping("/")
    public String sayHello() {
       //String something = restTemplate.getForEntity("http://hello-service/",helloConsumer.class).getBody().toString();
//       RestTemplate something = restTemplate.getForEntity("http://localhost:8080",helloConsumer.class)..getBody();
//       if (something!= "") {
//           return something;
//       }
       /// userClient.getS();
        //restTemplate.getForObject("http://hello-service/", String.class);

        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://hello-service/", String.class);
        //ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8080/", String.class);
        String body = responseEntity.getBody();
        HttpStatus statusCode = responseEntity.getStatusCode();
        int statusCodeValue = responseEntity.getStatusCodeValue();
        HttpHeaders headers = responseEntity.getHeaders();
        StringBuffer result = new StringBuffer();
        result.append("responseEntity.getBody()：").append(body).append("<hr>")
                .append("responseEntity.getStatusCode()：").append(statusCode).append("<hr>")
                .append("responseEntity.getStatusCodeValue()：").append(statusCodeValue).append("<hr>")
                .append("responseEntity.getHeaders()：").append(headers).append("<hr>");
        return result.toString();
//        return "wrong！";
    }
}
