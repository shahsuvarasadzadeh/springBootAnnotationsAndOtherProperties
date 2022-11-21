package com.imjavadeveloper.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class LazyService1 {

    private LazyService2 lazyService2;

    public LazyService1(@Lazy LazyService2 lazyService2) {
        this.lazyService2 = lazyService2;
    }
}
