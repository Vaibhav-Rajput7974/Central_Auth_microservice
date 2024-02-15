package com.example.Apigatewaykeyclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayKeyclockApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayKeyclockApplication.class, args);
	}

}
