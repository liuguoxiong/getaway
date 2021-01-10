package com.example.getaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetawayApplication {

    public static void main(String[] args) {
        SpringApplication.run( GetawayApplication.class, args );
        System.out.println("网关模块启动成功");
    }

}
