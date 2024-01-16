package com.alint.spring6learning.spring6diproject.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Setter injected is also highly frowned upon!";
    }
}
