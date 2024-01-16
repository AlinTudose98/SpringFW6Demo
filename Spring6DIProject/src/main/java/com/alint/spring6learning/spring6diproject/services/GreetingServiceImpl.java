package com.alint.spring6learning.spring6diproject.services;
import java.lang.Override;
import java.lang.String;
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service";
    }
}
