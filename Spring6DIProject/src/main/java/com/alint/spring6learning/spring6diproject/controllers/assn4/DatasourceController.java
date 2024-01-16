package com.alint.spring6learning.spring6diproject.controllers.assn4;

import com.alint.spring6learning.spring6diproject.services.assn4.DatasourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DatasourceController {
    private final DatasourceService datasourceService;

    @Autowired
    public DatasourceController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDataSourceConnectionString(){
        return datasourceService.getDatasourceString();
    }
}
