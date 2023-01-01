package com.imjavadeveloper.primary;

import com.imjavadeveloper.componentInter.ReaderPrimary;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryFile implements ReaderPrimary {
    @Override
    public String readTest() {
        return "Test File";
    }
}
