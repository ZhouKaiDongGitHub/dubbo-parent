package com.luban.consumer;

import com.luban.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        HelloService helloService =(HelloService) context.getBean("helloService");
        String result = helloService.sayHello();
        System.out.println(result);
    }
}
