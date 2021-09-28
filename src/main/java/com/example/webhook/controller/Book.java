package com.example.webhook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Book {

    @PostMapping(value="/post")
    public ResponseEntity<String> Creatd(@RequestBody String rbody){

        System.out.println("Created Successfully.. "+rbody);
        return new ResponseEntity<String>(rbody,HttpStatus.OK);
    }
    @GetMapping("/get")
    public String display(){

        System.out.println("Retrived Successfully.. ");
        return "Retrived Successfully.. ";
    }
     @PutMapping("/put")
    public String update(){
         System.out.println("Updated Successfully.. ");
        return "Updated Successfully..";
     }
     @DeleteMapping("/delete")
     public String remove(){
         System.out.println("Deleted Successfully.. ");
        return "Deleted successfully..";
    }
}
