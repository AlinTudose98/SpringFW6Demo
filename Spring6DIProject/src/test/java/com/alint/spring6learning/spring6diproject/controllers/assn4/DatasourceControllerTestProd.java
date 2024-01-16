package com.alint.spring6learning.spring6diproject.controllers.assn4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("prod")
class DatasourceControllerTestProd {

    @Autowired
    DatasourceController controller;
    @Test
    void getDataSourceConnectionString() {
        System.out.println(controller.getDataSourceConnectionString());
    }
}