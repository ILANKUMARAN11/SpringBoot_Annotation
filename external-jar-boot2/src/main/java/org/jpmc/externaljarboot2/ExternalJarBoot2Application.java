package org.jpmc.externaljarboot2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.jpmc", "net.tcs"})
public class ExternalJarBoot2Application {

}
