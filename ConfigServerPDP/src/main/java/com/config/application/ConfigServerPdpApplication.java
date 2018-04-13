package com.config.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class ConfigServerPdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerPdpApplication.class, args);
	}
}
