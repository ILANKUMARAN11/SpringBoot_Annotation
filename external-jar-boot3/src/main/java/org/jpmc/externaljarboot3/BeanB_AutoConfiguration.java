package org.jpmc.externaljarboot3;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.autoconfigure.AutoConfiguration;

@AutoConfiguration
@Slf4j
public class BeanB_AutoConfiguration implements BeanNameAware {

    @Override
    public void setBeanName(String beanName) {
        log.info("Bean name ::: {}", beanName);
    }
}
