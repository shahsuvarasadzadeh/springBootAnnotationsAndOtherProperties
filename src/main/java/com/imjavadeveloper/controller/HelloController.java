package com.imjavadeveloper.controller;


import com.imjavadeveloper.model.User;
import org.springframework.web.bind.annotation.*;

import java.lang.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "Hello  Taceddin!";
    }


    @GetMapping("/hello/{m}")
    public String returnMessage(@PathVariable("m") String m) {

        return "Your message : "+m;

    }

    @GetMapping("/message1")
        public String getMyMessage(@RequestParam(name = "message",required = false,defaultValue = "My Words") String message1){
       return "Your Message : "+message1;
        }


        @GetMapping({"/message2","/message2/{message}"})
    public String getMyMessage1(@PathVariable(name = "message",required = false)String message){
        return  "Your Message : "+message;
        }

        @PostMapping("user")
    public List<User> saveAllUsers(@RequestBody List<User> users){
            System.out.println("User saved!");
        users.forEach(user -> user.setPassword("") );
           return users;
        }
}
