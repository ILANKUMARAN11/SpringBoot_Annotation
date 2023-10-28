#### Get SpringBoot version

```java
@Configuration
@ConfigurationProperties(prefix = "test")
public class YamlConfig {
```

# OR

```java
@EnableConfigurationProperties({YamlConfig.class})
@SpringBootApplication
public class MainApplication {
```
