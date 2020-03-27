package com.hikari.eurekafeign.controller;

import com.hikari.eurekafeign.service.FeignDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class feignDemoCotroller {

    @Autowired
    private FeignDemoService feignDemoService;

    @GetMapping("/getlist")
    public List<String> getList() {
        return feignDemoService.feignDemo();
    }

}
