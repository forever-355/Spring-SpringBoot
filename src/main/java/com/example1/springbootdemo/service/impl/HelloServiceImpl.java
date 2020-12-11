package com.example1.springbootdemo.service.impl;

import com.example1.springbootdemo.service.HelloService;
import org.springframework.stereotype.Component;


@Component
public class HelloServiceImpl  implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("大家好");
    }
}
