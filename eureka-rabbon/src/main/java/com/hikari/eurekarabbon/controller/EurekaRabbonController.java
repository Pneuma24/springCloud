package com.hikari.eurekarabbon.controller;

import com.hikari.eurekarabbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaRabbonController {

    @Autowired
    HelloService helloService;

    @GetMapping("/demo")
    public String demo() {
        return helloService.sayHello();
    }

}
