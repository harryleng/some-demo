package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping
public class RabbitMqController {

    private static final String SUCCESS = "SUCCESS";
    private static final String FAILURE = "FAILURE";

    @Autowired
    private Producer producer;



    @RequestMapping(value = "/api/push")
    public String push() {
        producer.send();
        return SUCCESS;
    }
}
