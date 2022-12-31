package com.imjavadeveloper.qualifier;

import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfFileRead implements Reader{
    @Override
    public String readFile() {
        return "PDF File";
    }
}