package com.ilan.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.springdoc.core.utils.Constants.ALL_PATTERN;


//https://www.baeldung.com/openapi-jwt-authentication

@Profile("!default & !local")
@Configuration
public class OpenAPIProdConfig {

    Server localServer = new Server()
            .url("http://localhost:8080")
            .description("Localhost Server URL");

    Contact contact = new Contact()
            .email("ilankumaran.i@gmail.com")
            .name("Ilankumaran Ilangovan");
    Info info = new Info()
            .contact(contact)
            .description("Spring Boot 3 + Open API 3")
            .summary("Demo of Spring Boot 3 & Open API 3 Integration")
            .title("Spring Boot 3 + Open API 3")
            .version("V1.0.0")
            .license(new License().name("Apache 2.0").url("http://springdoc.org"));
    @Bean
    public GroupedOpenApi apiV1() {
        return GroupedOpenApi.builder()
                .addOpenApiCustomizer(publicApiCustomizer())
                .packagesToScan("com.ilan", "org.jpmc")
                .pathsToMatch(ALL_PATTERN)
                .group("External API")
                .build();
    }

    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(info)
                .addServersItem(localServer);
    }

    @Bean
    OpenApiCustomizer publicApiCustomizer(){
        final String securitySchemeName = "bearerAuth";
        final String authSchemeName = "Authorization";
        return openApi -> openApi.addSecurityItem(new SecurityRequirement()
                        .addList(securitySchemeName)
                        .addList(authSchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                //.name(securitySchemeName)
                                .in(SecurityScheme.In.HEADER)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }

}
