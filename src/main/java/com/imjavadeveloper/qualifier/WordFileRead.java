package com.imjavadeveloper.qualifier;

import com.imjavadeveloper.qualifier.Reader;

public class WordFileRead implements Reader {
    @Override
    public String readFile() {
        return "Word File";
    }
}
