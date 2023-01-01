package com.imjavadeveloper.injections;

import com.imjavadeveloper.componentInter.Reader;
import com.imjavadeveloper.componentInter.ReaderInjectionInter;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection implements ReaderInjectionInter {
    @Override
    public String readInject() {
        return "Constructor Injection";
    }
}
