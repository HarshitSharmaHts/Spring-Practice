package com.practice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.practice.config",
	"com.practice.dao",
	"com.practice.service"
})

@SpringBootApplication
public class MicroServiceStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceStudentApplication.class, args);
	}
}
