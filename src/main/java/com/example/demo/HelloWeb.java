package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWeb {

    @GetMapping("/")
    public String index(){
        return "hello world";
    }
}
