package com.pace2car.dubbodemo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pace2car.providerapi.service.HelloService;

/**
 * @author Pace2Car
 * @date 2019/5/10 9:26
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
