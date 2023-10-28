package org.jpmc.externaljarboot3;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@AutoConfiguration
@ComponentScans({
        @ComponentScan(basePackages = {"net.tcs"}),
        @ComponentScan(basePackages = {"org.jpmc"})
})
public class ExternalJarBoot3Application {

}
