package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {

    private final DemoApplicationService demoApplicationService;

    @Autowired
    public DemoApplicationController(DemoApplicationService demoApplicationService) {
        this.demoApplicationService = demoApplicationService;
    }

    @GetMapping("/dosomething")
    public String doSomething() {
        return this.demoApplicationService.doSomething();
        
    }
    
}