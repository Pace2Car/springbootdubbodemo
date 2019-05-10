package com.pace2car.dubbodemo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pace2car.providerapi.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pace2Car
 * @date 2019/5/10 9:40
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name){
        return helloService.sayHello(name);
    }

}
