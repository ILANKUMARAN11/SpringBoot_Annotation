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
| @EnableConfigurationProperties | [EXAMPLE](./@EnableConfigurationProperties/src/main/java/com/ilan/MainApplication.java)                  |                                                                 | https://stackoverflow.com/questions/49880453/what-difference-does-enableconfigurationproperties-make-if-a-bean-is-already-an <br> <br> https://www.baeldung.com/spring-enable-config-properties                   |
| @ConfigurationPropertiesScan | [EXAMPLE](./@EnableConfigurationProperties/src/main/java/com/ilan/MainApplication.java)                  |                                                                 |                                                                                                                                                                                                                   |
| @ConfigurationProperties | [EXAMPLE](./@EnableConfigurationProperties/src/main/java/com/ilan/config/YamlConfig.java)                |                                                                 |                                                                                                                                                                                                                   |
| @ComponentScans | [EXAMPLE](./external-jar-boot3/src/main/java/org/jpmc/externaljarboot3/ExternalJarBoot3Application.java) |                                                                 ||
| @ComponentScan | [EXAMPLE](./external-jar-boot2/src/main/java/org/jpmc/externaljarboot2/ExternalJarBoot2Application.java) |                                                                 |                                                                                                                                                                                                                   |
| @PropertyResources | [EXAMPLE](./external-jar-boot2/src/main/java/net/tcs/config/TestPropertyResource.java)                   | Reading(Loading) a group of property files from Resoruce folder ||
| @PropertyResource | [EXAMPLE](./external-jar-boot3/src/main/java/net/tcs/config/TestPropertyResource.java)                   | Reading(Loading) a property file from Resoruce folder           | https://www.baeldung.com/properties-with-spring <br><br> https://mkyong.com/spring/spring-propertysources-example/ <br><br>	https://www.javaguides.net/2018/09/spring-propertysource-annotation-with-example.html |


---
> **_NOTE:_**  
>**Enable autoconfiguration technique upto 2.6.15**
>
>>**Github:** https://github.com/spring-projects/spring-boot/blob/2.6.x/spring-boot-project/spring-boot-autoconfigure/src/main/resources/META-INF/spring.factories
>>
>>https://github.com/spring-projects/spring-boot/blob/v2.6.15/spring-boot-project/spring-boot-autoconfigure/src/main/resources/META-INF/spring.factories
>
>**Enable autoconfiguration technique from 2.7.0**
> 
>>**Github:** https://github.com/spring-projects/spring-boot/blob/2.7.x/spring-boot-project/spring-boot-autoconfigure/src/main/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
>>
>>https://github.com/spring-projects/spring-boot/blob/v2.7.0/spring-boot-project/spring-boot-autoconfigure/src/main/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
---
