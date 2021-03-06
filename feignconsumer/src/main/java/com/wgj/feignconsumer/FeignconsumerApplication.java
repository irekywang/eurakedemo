package com.wgj.feignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FeignconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignconsumerApplication.class, args);
    }

}

