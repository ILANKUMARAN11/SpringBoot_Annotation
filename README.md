# Spring-Boot Annotation

@ConfigurationPropertiesBinding
@EnableAutoConfiguration
@ImportAutoConfiguration
@NestedConfigurationProperty
@DeprecatedConfigurationProperty


| Annotation                                                         | README.md                                                                                                | Description                                                     | Reference link                                                                                                                                                                                                    |
|--------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| @AutoConfiguration | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 | https://stackoverflow.com/questions/75044304/custom-spring-boot-3-starter-does-not-create-configurationproperties-beans <br> ilan                                                                                 |
| @AutoConfigurationPackage | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 |                                                                                                                                                                                                                   |
| @AutoConfigurationAfter | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 |                                                                                                                                                                                                                   |
| @AutoConfigurationBefore | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 |                                                                                                                                                                                                                   |
| @AutoConfigureOrder | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 |                                                                                                                                                                                                                   |
| @EnableConfigurationProperties | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 | https://stackoverflow.com/questions/49880453/what-difference-does-enableconfigurationproperties-make-if-a-bean-is-already-an <br> <br> https://www.baeldung.com/spring-enable-config-properties                   |
| @ConfigurationPropertiesScan | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 |                                                                                                                                                                                                                   |
| @ConfigurationProperties | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 |                                                                                                                                                                                                                   |
| @ComponentScans | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 ||
| @ComponentScan | [README.md](./@EnableConfigurationProperties/README.md)                                                  |                                                                 |                                                                                                                                                                                                                   |
| @PropertyResources | [EXAMPLE](./external-jar-boot2/src/main/java/org/jpmc/externaljarboot2/config/TestPropertyResource.java) | Reading(Loading) a group of property files from Resoruce folder ||
| @PropertyResource | [EXAMPLE](./external-jar-boot3/src/main/java/org/jpmc/externaljarboot3/config/TestPropertyResource.java) | Reading(Loading) a property file from Resoruce folder           | https://www.baeldung.com/properties-with-spring <br><br> https://mkyong.com/spring/spring-propertysources-example/ <br><br>	https://www.javaguides.net/2018/09/spring-propertysource-annotation-with-example.html |


---
> **_NOTE:_**  
>**Enable autoconfiguration technique upto 2.6.15**
>
>**Github:** https://github.com/spring-projects/spring-boot/blob/2.6.x/spring-boot-project/spring-boot-autoconfigure/src/main/resources/META-INF/spring.factories
>
>**Enable autoconfiguration technique from 2.7.0**
> 
>**Github:** https://github.com/spring-projects/spring-boot/blob/2.7.x/spring-boot-project/spring-boot-autoconfigure/src/main/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
>
---
