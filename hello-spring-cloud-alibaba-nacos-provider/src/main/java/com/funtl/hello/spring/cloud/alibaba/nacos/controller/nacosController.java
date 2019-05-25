package com.funtl.hello.spring.cloud.alibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nacosController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/nacos/{message}")
    public String echo(@PathVariable("message") String message){

        return "hello Nacos "+message+"目前端口"+port;
    }
}
