package com.imjavadeveloper;

import com.imjavadeveloper.qualifier.Reader;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TestFile implements Reader {
    @Override
    public String readFile() {
        return "Test File";
    }
}
