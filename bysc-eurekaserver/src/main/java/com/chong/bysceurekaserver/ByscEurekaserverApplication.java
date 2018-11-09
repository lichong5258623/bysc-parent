package com.chong.bysceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ByscEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByscEurekaserverApplication.class, args);
	}
}
