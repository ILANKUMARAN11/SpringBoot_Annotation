package org.jpmc.externaljarboot3;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

@AutoConfiguration(
        after = {ExternalJarBoot3Application.class}
)
@AutoConfigureOrder(100)
@Slf4j
public class AA_AutoConfiguration implements BeanNameAware {

    @Override
    public void setBeanName(String beanName) {
        //log.info("Bean name ::: {}", beanName);
    }

    @PostConstruct
    public void init() {
        log.info("PostConstruct Bean name ::: {}", "AA_AutoConfiguration");
    }
}
