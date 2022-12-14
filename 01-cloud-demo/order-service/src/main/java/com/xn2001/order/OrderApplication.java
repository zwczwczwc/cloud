package com.xn2001.order;

import com.feign.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.xn2001.order.mapper")
@SpringBootApplication
@EnableFeignClients(basePackages = "com.feign.clients", defaultConfiguration = DefaultFeignConfiguration.class)
//@EnableEurekaClient
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    /*
    * 创建Resttemplate并注入Spring
    * resttemplate是专门用来处理HTTP请求的
    * */
    /*@Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/
}