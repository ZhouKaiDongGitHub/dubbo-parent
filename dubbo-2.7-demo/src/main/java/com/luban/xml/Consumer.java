package com.luban.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        HelloService helloService =(HelloService) context.getBean("demoService");
        String result = helloService.sayHello();
        System.out.println(result);
    }
}
