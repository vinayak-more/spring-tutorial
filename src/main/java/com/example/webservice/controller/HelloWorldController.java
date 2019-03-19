package com.example.webservice.controller;

import javax.validation.Valid;

import com.example.webservice.bean.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorldController {

    @GetMapping
    public HelloWorld getHelloWorld() {
        HelloWorld h = new HelloWorld();
        h.setMessage("Hello World");
        h.setId("123");
        return h;
    }

    @PostMapping
    public void postHelloWorld(@Valid @RequestBody HelloWorld h){
      System.out.println(h);
    }

}