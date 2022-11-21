package com.imjavadeveloper.controller;


import com.imjavadeveloper.*;
import com.imjavadeveloper.dto.User;
import com.imjavadeveloper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private FirstClass firstClass;
    @Autowired
    private SecondClass secondClass;
    @Qualifier("PDF")
    @Autowired
    private Reader reader;

    @Qualifier("EXCEL")
    @Autowired
    private Reader getreader1;

    @Qualifier("WORD")
    @Autowired
    private Reader getreader2;

    @Autowired
    private Reader testReader;
    //Field Injection
    @Autowired
    private Reader fieldInjection;


    private SetterInjection setterInjection;

    private ConstructorInjection constructorInjection;


    // Setter Injection
    @Autowired
    public void setSetterInjection(SetterInjection setterInjection) {
        this.setterInjection = setterInjection;
    }


    //Constructor Injection
    public UserController(ConstructorInjection constructorInjection) {
        this.constructorInjection = constructorInjection;
    }

    @GetMapping("/injection")
    public String read5() {
        return this.fieldInjection.readFile() + "  -  " + this.setterInjection.readFile()
                + "  -  " + this.constructorInjection.readFile();
    }


    @GetMapping("/read")
    public String read3() {
        return testReader.readFile();
    }
    @GetMapping("/read-PDF")
    public String read(){
        return reader.readFile();
    }

    @GetMapping("/read-EXCEL")
    public String read1(){
        return getreader1.readFile();
    }
    @GetMapping("/read-WORD")
    public String read2(){
        return getreader2.readFile();
    }


    @GetMapping(path = "/first-class")
    public String getNameOfFirstClass() {
        return firstClass.getName();
    }

    @GetMapping(path = "/second-class")
    public String getNameOfSecondClass() {
        return secondClass.getName();
    }

    @GetMapping(path = "/users/{UserId}")
    public User getUserId(@PathVariable("UserId") Long userId) {
        return userService.getUserById(userId);
    }

}
