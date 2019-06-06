package com.lpf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.lpf.demo.dao")
@EnableEurekaClient//注册中心客户端;
public class DemoCopyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCopyApplication.class, args);
    }
}
