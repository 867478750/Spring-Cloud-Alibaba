package com.funtl.hello.spring.cloud.alibaba.nacos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class comsumerConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
