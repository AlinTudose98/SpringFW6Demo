package com.alint.spring6learning.spring6diproject.controllers;

import com.alint.spring6learning.spring6diproject.services.GreetingService;
import com.alint.spring6learning.spring6diproject.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

     private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
