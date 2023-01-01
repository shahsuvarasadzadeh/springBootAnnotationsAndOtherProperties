package com.imjavadeveloper.controller;

import com.imjavadeveloper.componentInter.Reader;
import com.imjavadeveloper.injections.ConstructorInjection;
import com.imjavadeveloper.injections.SetterInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Controller_For_Injections {


    private SetterInjection setterInjection;

    private ConstructorInjection constructorInjection;

    @Autowired
    private Reader fieldInjection;


    // Setter Injection
    @Autowired
    public void setSetterInjection(SetterInjection setterInjection) {
        this.setterInjection = setterInjection;
    }


    public Controller_For_Injections(ConstructorInjection constructorInjection) {
        this.constructorInjection = constructorInjection;
    }

    @GetMapping("/injection")
    public String read5() {
        return this.fieldInjection.readFile() + "  -  " + this.setterInjection.readInject()
                + "  -  " + this.constructorInjection.readInject();
    }
}
