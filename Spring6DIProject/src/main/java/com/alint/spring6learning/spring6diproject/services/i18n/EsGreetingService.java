package com.alint.spring6learning.spring6diproject.services.i18n;

import com.alint.spring6learning.spring6diproject.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class EsGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "¡Buenos dias!";
    }
}
