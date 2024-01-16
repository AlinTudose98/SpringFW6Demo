package com.alint.spring6learning.spring6diproject.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "friends don't let friends do property injection";
    }
}
