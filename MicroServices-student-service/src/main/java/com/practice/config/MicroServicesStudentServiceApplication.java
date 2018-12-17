package com.practice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
	"com.practice.controller",
	"com.practice.config"
})
@SpringBootApplication
@EnableEurekaClient
public class MicroServicesStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesStudentServiceApplication.class, args);
	}
}
