package com.pursuer.microservice.orderinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PursuerBusinessDisplayOrderinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PursuerBusinessDisplayOrderinfoApplication.class, args);
    }

}
