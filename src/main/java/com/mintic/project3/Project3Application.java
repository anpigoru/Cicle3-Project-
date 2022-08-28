package com.mintic.project3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class Project3Application {
	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}

}
