package com.practice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
		"com.practice.controller",
		"com.practice.repository"
})
@SpringBootApplication
@EnableEurekaClient
public class MicroServicesDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesDbServiceApplication.class, args);
	}
}
