package org.jpmc.externaljarboot2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "test", ignoreUnknownFields = true)
@PropertySources({
        @PropertySource(value = "classpath:Test.yml", factory = YamlPropertySourceFactory.class),
        @PropertySource(value = "classpath:Test-Beta.yml", factory = YamlPropertySourceFactory.class)
}
)
@Data
public class TestPropertyResource {
    Map<String, String> replace;
    Map<String, String> familyMembers;
}
