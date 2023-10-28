package org.jpmc.externaljarboot3.component;

import net.tcs.config.TestPropertyResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TestComponent {

    @Autowired
    private TestPropertyResource testPropertyResource;

    public Map<String, String> testComponent(){
        return testPropertyResource.getReplace();
    }
}
