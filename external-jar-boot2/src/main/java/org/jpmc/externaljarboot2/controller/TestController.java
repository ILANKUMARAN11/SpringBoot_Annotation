package org.jpmc.externaljarboot2.controller;

import org.jpmc.externaljarboot2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public Map<String, String> helloWorld(){
        return testService.helloWorldService();
    }
}
