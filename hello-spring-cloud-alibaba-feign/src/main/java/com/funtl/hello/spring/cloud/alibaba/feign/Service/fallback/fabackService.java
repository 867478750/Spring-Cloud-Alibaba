package com.funtl.hello.spring.cloud.alibaba.feign.Service.fallback;

import com.funtl.hello.spring.cloud.alibaba.feign.Service.feignService;
import org.springframework.stereotype.Component;

@Component
public class fabackService implements feignService {

    @Override
    public String echo(String message) {
        return "网络出现问题";
    }
}
