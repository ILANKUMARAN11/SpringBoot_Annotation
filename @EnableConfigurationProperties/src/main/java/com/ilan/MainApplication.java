package com.ilan;

import config.YamlConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties({YamlConfig.class})
@SpringBootApplication
@Slf4j
public class MainApplication implements CommandLineRunner {

	@Autowired
	YamlConfig yamlConfig;

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		yamlConfig
				.getReplace()
				.entrySet()
				.stream()
				.forEach(replace->{
					log.info("KEY ::: {}", replace.getKey());
					log.info("VALUE ::: {}", replace.getValue());
				});
	}
}
