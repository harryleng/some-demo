package com.example.springboot.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloQueue")
public class Receiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver: " + msg);
    }
}
