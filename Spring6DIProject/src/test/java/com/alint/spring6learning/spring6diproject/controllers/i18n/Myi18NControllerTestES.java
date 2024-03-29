package com.alint.spring6learning.spring6diproject.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
public class Myi18NControllerTestES {
    @Autowired
    Myi18nController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}
