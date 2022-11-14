package com.imjavadeveloper.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello  Taceddin!";
    }
}
