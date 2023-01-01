package com.imjavadeveloper.qualifier;

import com.imjavadeveloper.componentInter.Reader;

public class WordFileRead implements Reader {
    @Override
    public String readFile() {
        return "Word File";
    }
}
