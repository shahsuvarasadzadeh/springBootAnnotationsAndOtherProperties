package com.imjavadeveloper.injections;

import com.imjavadeveloper.componentInter.Reader;
import com.imjavadeveloper.componentInter.ReaderInjectionInter;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection implements ReaderInjectionInter {
    @Override
    public String readInject() {
        return "Setter Injection";
    }
}
