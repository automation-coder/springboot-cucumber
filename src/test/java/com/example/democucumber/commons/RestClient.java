package com.example.democucumber.commons;

import io.cucumber.spring.CucumberTestContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RestClient {

    private String str;

    @Bean
    public void initialize() {
        System.out.println("Inside Bean");
        str = "Bean";
    }

    public String getString() {
        return str;
    }
}
