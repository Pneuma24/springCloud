package com.hikari.eurekafeign.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "eureka-client")
public interface FeignDemoService {

    @RequestMapping(value = "/eurekaclient/getlist")
    List<String> feignDemo();

}
