package com.mydemo.api.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppDiscoveryServiceApplication //http://localhost:8010/
{
    public static void main(String[] args)
    {
        SpringApplication.run(AppDiscoveryServiceApplication.class, args);
    }
}