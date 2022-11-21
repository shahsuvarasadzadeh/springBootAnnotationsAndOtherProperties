package com.imjavadeveloper;

import org.springframework.stereotype.Component;

@Component
public class TestFile1 implements Reader{
    @Override
    public String readFile() {
        return "Test File1";
    }
}
