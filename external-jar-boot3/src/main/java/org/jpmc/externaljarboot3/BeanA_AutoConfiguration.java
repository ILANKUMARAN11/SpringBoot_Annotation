package org.jpmc.externaljarboot3;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@AutoConfiguration
@Slf4j
public class BeanA_AutoConfiguration implements BeanNameAware {

    @Override
    public void setBeanName(String beanName) {
        log.info("Bean name ::: {}", beanName);
    }
}
