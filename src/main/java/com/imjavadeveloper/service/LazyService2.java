package com.imjavadeveloper.service;

import org.springframework.stereotype.Service;

@Service
public class LazyService2 {
    private LazyService1 lazyService1;

    public LazyService2(LazyService1 lazyService1) {
        this.lazyService1 = lazyService1;
    }
}
