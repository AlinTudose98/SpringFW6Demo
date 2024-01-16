package com.alint.spring6learning.spring6diproject.services.assn4;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QaDatasourceService implements DatasourceService {
    @Override
    public String getDatasourceString() {
        return "qa";
    }
}
