package com.imjavadeveloper;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection implements Reader{
    @Override
    public String readFile() {
        return "Constructor Injection";
    }
}
