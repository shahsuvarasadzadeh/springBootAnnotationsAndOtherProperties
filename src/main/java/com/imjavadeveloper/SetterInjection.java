package com.imjavadeveloper;

import org.springframework.stereotype.Component;

@Component
public class SetterInjection implements Reader{
    @Override
    public String readFile() {
        return "Setter Injection";
    }
}
