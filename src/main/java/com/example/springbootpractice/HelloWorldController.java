package com.example.springbootpractice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    
    @GetMapping("getRequest")
    public String getMethodName() {
        return "HelloWorld!";
    }
    
}
