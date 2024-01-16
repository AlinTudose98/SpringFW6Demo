package com.alint.spring6learning.spring6diproject;

import com.alint.spring6learning.spring6diproject.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiProjectApplicationTests {

    @Autowired
    ApplicationContext ctx;
    @Autowired
    MyController controller;

    @Test
    void testAutowiredOfController(){
        System.out.println(controller.sayHello());
    }
    @Test
    void testGetControllerFromCtx(){
        MyController controller = ctx.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }
    @Test
    void contextLoads() {
    }


}
