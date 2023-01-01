package com.imjavadeveloper.qualifier;

import com.imjavadeveloper.componentInter.Reader;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("EXCEL")
@Primary
public class ExcelFileRead implements Reader {
    @Override
    public String readFile() {
        return "EXCEL File";
    }
}
