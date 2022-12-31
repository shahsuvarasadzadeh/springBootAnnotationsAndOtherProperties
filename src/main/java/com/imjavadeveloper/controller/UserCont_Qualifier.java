package com.imjavadeveloper.controller;

import com.imjavadeveloper.qualifier.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api1")
public class UserCont_Qualifier {


    @Qualifier("PDF")
    @Autowired
    private Reader reader;

    @Qualifier("EXCEL")
    @Autowired
    private Reader getreader1;

    @Qualifier("WORD")
    @Autowired
    private Reader getreader2;


    @GetMapping("/read-PDF")
    public String read() {
        return reader.readFile();
    }

    @GetMapping("/read-EXCEL")
    public String read1() {
        return getreader1.readFile();
    }

    @GetMapping("/read-WORD")
    public String read2() {
        return getreader2.readFile();
    }

}
