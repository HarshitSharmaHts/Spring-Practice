package com.practice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.practice.jpa")
@EntityScan("com.practice.model")
public class SpringJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaExampleApplication.class, args);
	}
}
