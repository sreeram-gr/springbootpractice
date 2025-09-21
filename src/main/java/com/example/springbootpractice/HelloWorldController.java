package com.example.springbootpractice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("todo")
public class HelloWorldController {
    
    @GetMapping("getRequest")
    public String getMethodName() {
        return "HelloWorld!";
    }

    @GetMapping("{id}")
    public String getName(@PathVariable int id) {
        return "Todo "+ id;
    }

    @GetMapping
    public String getQueryParamName(@RequestParam("id") int id) {
        return "query "+ id;
    }

    @PostMapping("create")
    public String postBody(@RequestBody String body) {
        return body;
    }

    @PutMapping("{id}")
    public String updateTodo(@PathVariable int id) {
        return "updated: "+id;
    }

    @DeleteMapping("{id}")
    public String deleteTodo(@PathVariable int id) {
        return "deleted: "+id;
    }
    
}
