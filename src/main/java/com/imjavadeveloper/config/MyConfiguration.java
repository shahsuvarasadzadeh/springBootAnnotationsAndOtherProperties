package com.imjavadeveloper.config;

import com.imjavadeveloper.Example2;
import com.imjavadeveloper.Example1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class MyConfiguration {

    public MyConfiguration() {
        System.out.println("Hello my Configuration");
    }

    @Bean
    public Example1 getExample1(){
        return new Example1();
    }

    @Bean
    public Example2 getExample2(){
        return new Example2();
    }

}
