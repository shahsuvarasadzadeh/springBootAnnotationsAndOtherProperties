package com.imjavadeveloper;

import org.springframework.stereotype.Component;

@Component
public class FieldInjection implements Reader{
    @Override
    public String readFile() {
        return "Field Injection";
    }
}
