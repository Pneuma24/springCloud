package com.hikari.eurekarabbon.service.impl;

import com.hikari.eurekarabbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sayHello() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/eurekaclient/clientdemo", String.class);
    }
}
