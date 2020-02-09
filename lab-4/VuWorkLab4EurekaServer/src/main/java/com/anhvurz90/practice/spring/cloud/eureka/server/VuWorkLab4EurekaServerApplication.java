package com.anhvurz90.practice.spring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VuWorkLab4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuWorkLab4EurekaServerApplication.class, args);
	}

}
