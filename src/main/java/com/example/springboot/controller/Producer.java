package com.example.springboot.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Producer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String sendMsg = "Hi~ " + new Date();
        this.rabbitTemplate.convertAndSend("helloQueue", sendMsg);
    }

}
