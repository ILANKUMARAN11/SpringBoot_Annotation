### Get SpringBoot version
```java
String springVersion = org.springframework.boot.SpringBootVersion.getVersion();
```

### Get SpringBoot version
```java
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
```
