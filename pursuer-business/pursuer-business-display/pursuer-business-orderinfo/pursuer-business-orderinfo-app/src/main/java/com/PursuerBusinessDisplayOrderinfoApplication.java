package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.pursuer.microservice.orderinfo.app.dao")
public class PursuerBusinessDisplayOrderinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PursuerBusinessDisplayOrderinfoApplication.class, args);
    }

}
