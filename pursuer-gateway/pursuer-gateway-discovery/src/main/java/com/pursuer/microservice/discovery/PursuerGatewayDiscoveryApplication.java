package com.pursuer.microservice.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PursuerGatewayDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PursuerGatewayDiscoveryApplication.class, args);
    }

}
