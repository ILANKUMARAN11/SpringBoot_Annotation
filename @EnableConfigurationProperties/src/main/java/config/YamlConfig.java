package config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

//@Configuration
@ConfigurationProperties(prefix = "test")
@Data
public class YamlConfig {
    Map<String, String> replace = new HashMap<>();
}
