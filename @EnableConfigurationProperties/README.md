#### @EnableConfigurationProperties


```java
@Configuration
@ConfigurationProperties(prefix = "test")
public class YamlConfig {
//...some code
}
```

# OR

```java
@ConfigurationProperties(prefix = "test")
public class YamlConfig {
//...some code
}
```

```java
@Configuration
@EnableConfigurationProperties({YamlConfig.class})
public class ApplicationConfig {
//...some code
}
```

# OR
In this case @ConfigurationPropertiesScan can help to scan the current package and create the bean for annotated classes @ConfigurationProperties
```java
@ConfigurationProperties(prefix = "some-prefix")
@ConfigurationPropertiesScan
public class ConfigProperties {
//...some code
}
```

---
> **_NOTE:_**  
>**@ConfigurationProperties** - Used to bind a class with an externalized property file. Very powerful and must be used to separate out bean classes with configuration entity class.
>
>**@Configuration** - Creates a Spring bean of configuration stereotype.
>
>**@EnableConfigurationProperties** - Creates a binding between a configuration entity class and Spring configuration stereotype so that after injection within a service properties can be retrieved easily.
>
---
