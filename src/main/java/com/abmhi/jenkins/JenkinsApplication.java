package com.abmhi.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Hello Jenkins");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
