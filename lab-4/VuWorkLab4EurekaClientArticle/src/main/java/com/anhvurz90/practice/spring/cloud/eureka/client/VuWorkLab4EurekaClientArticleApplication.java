package com.anhvurz90.practice.spring.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VuWorkLab4EurekaClientArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuWorkLab4EurekaClientArticleApplication.class, args);
	}

}
