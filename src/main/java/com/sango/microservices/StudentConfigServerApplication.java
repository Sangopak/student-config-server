package com.sango.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StudentConfigServerApplication {
	public static void main (final String[] args) {
		SpringApplication.run(StudentConfigServerApplication.class, args);
	}
}
