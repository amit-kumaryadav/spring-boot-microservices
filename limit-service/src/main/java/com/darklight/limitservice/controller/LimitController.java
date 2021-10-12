package com.darklight.limitservice.controller;

import com.darklight.limitservice.configuration.Configuration;
import com.darklight.limitservice.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limit retrieveLimit() {
        return new Limit(configuration.getMinimum(), configuration.getMaximum());
    }
}
