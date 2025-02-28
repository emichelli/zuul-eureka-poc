package com.coinsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SimpleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleServiceApplication.class, args);
	}
}
