package org.jpmc.externaljarboot3;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScans({
        @ComponentScan(basePackages = {"net.tcs"}),
        @ComponentScan(basePackages = {"org.jpmc"})
})
@Slf4j
@AutoConfiguration(
        before = {AA_AutoConfiguration.class}
)
@ConditionalOnWebApplication(
        type = ConditionalOnWebApplication.Type.SERVLET
)
@AutoConfigureOrder(1)
public class ExternalJarBoot3Application implements BeanNameAware {

    @Override
    public void setBeanName(String beanName) {
        //log.info("Bean name ::: {}",beanName);
    }

    @PostConstruct
    public void init() {
        log.info("PostConstruct Bean name ::: {}", "ExternalJarBoot3Application");
    }

}
