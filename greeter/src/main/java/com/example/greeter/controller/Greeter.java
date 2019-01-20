package com.example.greeter.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class Greeter {

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }
}