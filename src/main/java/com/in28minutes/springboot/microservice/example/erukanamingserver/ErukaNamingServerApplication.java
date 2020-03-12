package com.in28minutes.springboot.microservice.example.erukanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErukaNamingServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ErukaNamingServerApplication.class, args);
	}

}
