package org.jpmc.externaljarboot2.component;

import org.jpmc.externaljarboot2.config.TestPropertyResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TestComponent {

    @Autowired
    private TestPropertyResource testPropertyResource;

    public Map<String, String> testComponent(){
        Map<String, String> response = new HashMap<>();
        response.putAll(testPropertyResource.getReplace());
        response.putAll(testPropertyResource.getFamilyMembers());
        return response;
    }
}
