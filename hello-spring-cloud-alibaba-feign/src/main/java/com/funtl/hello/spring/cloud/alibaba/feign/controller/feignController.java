package com.funtl.hello.spring.cloud.alibaba.feign.controller;

import com.funtl.hello.spring.cloud.alibaba.feign.Service.feignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class feignController {
    @Autowired
    feignService feignService;

    @GetMapping(value = "/feign")
    public String test(){
        return feignService.echo("nlb");
    }
}
