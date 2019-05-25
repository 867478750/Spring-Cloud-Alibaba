package com.funtl.hello.spring.cloud.alibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class consumerController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @Value("${spring.application.name}")
    private String comsumerName;

    @GetMapping(value = "ss")
    public String ss(){
        return "helllo";
    }

    @GetMapping(value = "echo/app/name")
    public String echo() {
        //使用 LoadBalanceClient 和 RestTemplate 结合的方式来访问
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String url = String.format("http://%s:%s/nacos/%s", serviceInstance.getHost(),serviceInstance.getPort(),comsumerName);
        return restTemplate.getForObject(url, String.class);
    }
}
