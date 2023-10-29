package com.ilan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;

@SpringBootApplication
public class UseExternalJarBoot3Application {

	DispatcherServletAutoConfiguration dispatcherServletAutoConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(UseExternalJarBoot3Application.class, args);
	}

}
