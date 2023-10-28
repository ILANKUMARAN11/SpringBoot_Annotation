package org.jpmc.externaljarboot3.component;

import org.jpmc.externaljarboot3.config.TestPropertyResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TestComponent {

    @Autowired
    TestPropertyResource testPropertyResource;

    public Map<String, String> testComponent(){
        return testPropertyResource.getReplace();
    }
}