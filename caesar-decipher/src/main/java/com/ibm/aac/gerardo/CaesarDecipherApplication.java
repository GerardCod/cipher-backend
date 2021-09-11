package com.ibm.aac.gerardo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CaesarDecipherApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaesarDecipherApplication.class, args);
	}

}
