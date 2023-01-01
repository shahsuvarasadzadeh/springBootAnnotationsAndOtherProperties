package com.imjavadeveloper.controller;


import com.imjavadeveloper.*;
import com.imjavadeveloper.componentInter.Reader;
import com.imjavadeveloper.componentInter.UserService;
import com.imjavadeveloper.config.MyConfiguration;
import com.imjavadeveloper.dto.User;
import com.imjavadeveloper.injections.ConstructorInjection;
import com.imjavadeveloper.injections.SetterInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private UserService userService;
    @Autowired
    private FirstClass firstClass;
    @Autowired
    private SecondClass secondClass;

    private MyConfiguration myConfiguration;


    @Autowired
    private Reader testReader;
    //Field Injection





    @Autowired
    private Example1 example1;


//    public UserController(Example1 example1) {
//        this.example1 = example1;
//    }

    @Autowired
    private MyComponentLazy myComponentLazy;


    @GetMapping("/applicationContext")
    public void exampleApplicationContext() {
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();


        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(beanDefinitionCount);

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        FirstClass firstClass1 = (FirstClass) applicationContext.getBean(FirstClass.class);
        System.out.println(firstClass1.getName());


    }

    @GetMapping("/lazy")
    public String getMyComponent() {
        return myComponentLazy.getName();
    }



    @Autowired
    public UserController(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
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
