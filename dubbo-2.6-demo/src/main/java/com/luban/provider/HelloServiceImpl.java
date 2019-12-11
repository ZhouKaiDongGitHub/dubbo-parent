package com.luban.provider;

import com.luban.api.HelloService;

public class HelloServiceImpl implements HelloService {
    public String sayHello() {
        return "Hello,I am Service";
    }
}
