package com.springboot.scheduler.SpringBootSchedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedularApplication.class, args);
	}

}
