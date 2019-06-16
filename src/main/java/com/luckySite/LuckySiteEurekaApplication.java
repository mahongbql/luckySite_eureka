package com.luckySite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LuckySiteEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckySiteEurekaApplication.class, args);
	}
}
