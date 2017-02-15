package com.jorge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microspring5EurekaDiscoveryClientLab5Application {

	public static void main(String[] args) {
		SpringApplication.run(Microspring5EurekaDiscoveryClientLab5Application.class, args);
	}
}
