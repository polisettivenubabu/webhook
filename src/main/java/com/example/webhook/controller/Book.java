package com.example.webhook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Book {

    @PostMapping(value="/webhook")
    public ResponseEntity<String> print(@RequestBody String rbody){
        System.out.println("sample"+ rbody);

        return new ResponseEntity<String> (rbody, HttpStatus.OK);
    }
    @GetMapping("/get")
    public void display(){
        System.out.println("sample");
           }
}
