package com.imjavadeveloper;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyComponentLazy {

    public MyComponentLazy() {
        System.out.println("My Component Lazy Initialized");
    }

    public String getName(){
        return "My GetName ";
    }
}
