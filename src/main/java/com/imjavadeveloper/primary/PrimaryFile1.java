package com.imjavadeveloper.primary;

import com.imjavadeveloper.componentInter.ReaderPrimary;
import org.springframework.stereotype.Component;

@Component
public class PrimaryFile1 implements ReaderPrimary {
    @Override
    public String readTest() {
        return "Test File1";
    }
}
