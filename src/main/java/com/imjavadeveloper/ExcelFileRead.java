package com.imjavadeveloper;

import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelFileRead implements Reader{
    @Override
    public String readFile() {
        return "EXCEL File";
    }
}
