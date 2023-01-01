package com.imjavadeveloper.qualifier;

import com.imjavadeveloper.componentInter.Reader;
import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfFileRead implements Reader {
    @Override
    public String readFile() {
        return "PDF File";
    }
}
