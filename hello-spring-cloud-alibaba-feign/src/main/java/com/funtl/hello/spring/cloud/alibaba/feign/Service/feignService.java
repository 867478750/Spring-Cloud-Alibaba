package com.funtl.hello.spring.cloud.alibaba.feign.Service;

import com.funtl.hello.spring.cloud.alibaba.feign.Service.fallback.fabackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = fabackService.class)
public interface feignService {
    @GetMapping(value = "/nacos/{message}")
    String echo(@PathVariable("message") String message);

}

