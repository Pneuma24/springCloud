package com.hikari.eurekaclient2.controller;

import com.hikari.eurekaclient2.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/eurekaclient")
public class EurekaClientController {

    @Autowired
    ClientService clientService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/clientdemo")
    public String clientDemo() {
        return "hi" + "i am port:" + port;
    }

    @GetMapping("/getlist")
    public List<String> getList() {
        String[] str = {"2", "4", "6", "8", "10"};
        System.out.println(port);
        return clientService.getList(str);
    }

}
