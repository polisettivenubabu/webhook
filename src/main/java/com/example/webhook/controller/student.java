package com.example.webhook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class student {

    @GetMapping(value="/student/get")
    public String display(){
        return "sample...";
        
    }
}
