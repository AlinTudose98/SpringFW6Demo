package com.alint.spring6learning.spring6diproject.controllers;

import com.alint.spring6learning.spring6diproject.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
