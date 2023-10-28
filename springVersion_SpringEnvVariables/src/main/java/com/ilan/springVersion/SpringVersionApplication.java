package com.ilan.springVersion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


@Slf4j
@SpringBootApplication
public class SpringVersionApplication implements CommandLineRunner {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(SpringVersionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String springVersion = org.springframework.boot.SpringBootVersion.getVersion();
        log.info(springVersion);

        this.getAllEnvVariables()
                .entrySet()
                .stream().forEach(e -> log.info("Key ::: {} , Value ::: {}", e.getKey(), e.getValue()));
    }

    public Map<String, Object> getAllEnvVariables() {
        Map<String, Object> environmentVariables = new HashMap();
        for (Iterator it = ((AbstractEnvironment) environment).getPropertySources().iterator(); it.hasNext(); ) {
            PropertySource propertySource = (PropertySource) it.next();
            if (propertySource instanceof MapPropertySource) {
                environmentVariables.putAll(((MapPropertySource) propertySource).getSource());
            }
        }
        return environmentVariables;
    }
}
