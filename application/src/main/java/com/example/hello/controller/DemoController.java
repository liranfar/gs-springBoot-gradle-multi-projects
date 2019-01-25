package com.example.hello.controller;

import com.example.hello.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private MyService myService;

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/")
    public String home() {
        return myService.message();
    }
}
