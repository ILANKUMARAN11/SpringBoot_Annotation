package com.ilan.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"default", "local"})
@Configuration
public class OpenAPILocalConfig {

    Contact contact = new Contact()
            .email("ilankumaran.i@gmail.com")
            .name("Ilankumaran Ilangovan");

    Info info = new Info()
            .contact(contact)
            .description("Spring Boot 2 + Open API 3")
            .summary("Demo of Spring Boot 2 & Open API 3 Integration")
            .title("Spring Boot 2 + Open API 3")
            .version("V1.0.0")
            .license(new License().name("Apache 2.0").url("http://springdoc.org"));

    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(info);
    }
}
