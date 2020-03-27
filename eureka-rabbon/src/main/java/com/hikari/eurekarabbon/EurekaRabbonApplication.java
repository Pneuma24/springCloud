package com.hikari.eurekarabbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaRabbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRabbonApplication.class, args);
    }

}
