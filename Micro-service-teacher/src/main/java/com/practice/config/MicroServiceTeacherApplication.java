package com.practice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
	"com.practice.config",
	"com.practice.service",
	"com.practice.dao"
})

@SpringBootApplication
public class MicroServiceTeacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceTeacherApplication.class, args);
	}
}
