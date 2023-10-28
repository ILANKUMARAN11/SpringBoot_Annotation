package org.jpmc.externaljarboot3.controller;

import org.jpmc.externaljarboot3.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public Map<String, String> helloWorld(){
        return testService.helloWorldService();
    }
}
