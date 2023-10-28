package org.jpmc.externaljarboot3.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "test", ignoreUnknownFields = true)
@PropertySource("classpath:foo.properties")
@Data
public class TestPropertyResource {
    Map<String, String> replace = new HashMap<>();
}
