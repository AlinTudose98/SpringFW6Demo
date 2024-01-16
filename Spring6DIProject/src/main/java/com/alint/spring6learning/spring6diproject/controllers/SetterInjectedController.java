package com.alint.spring6learning.spring6diproject.controllers;

import com.alint.spring6learning.spring6diproject.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
