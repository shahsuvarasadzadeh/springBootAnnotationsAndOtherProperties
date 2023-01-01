package com.imjavadeveloper.controller;

import com.imjavadeveloper.componentInter.ReaderPrimary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Controller_Primary {

    private final ReaderPrimary readerPrimary;

    public Controller_Primary(ReaderPrimary readerPrimary) {
        this.readerPrimary = readerPrimary;
    }

    @GetMapping("/read")
    public String read3() {
        return readerPrimary.readTest();
    }
}
