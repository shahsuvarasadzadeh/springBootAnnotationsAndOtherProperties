package com.imjavadeveloper;

import com.imjavadeveloper.qualifier.Reader;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection implements Reader {
    @Override
    public String readFile() {
        return "Field Injection";
    }
}
