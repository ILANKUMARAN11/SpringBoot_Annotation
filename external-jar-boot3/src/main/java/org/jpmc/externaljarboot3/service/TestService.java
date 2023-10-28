package org.jpmc.externaljarboot3.service;

import org.jpmc.externaljarboot3.component.TestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestService {

    @Autowired
    TestComponent testComponent;
    public Map<String, String> helloWorldService(){
        return testComponent.testComponent();
    }
}
