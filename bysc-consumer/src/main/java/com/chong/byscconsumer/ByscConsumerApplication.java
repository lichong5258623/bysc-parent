package com.chong.byscconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.chong.api.service"})
public class ByscConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByscConsumerApplication.class, args);
	}
}
