package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaClientApplication2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientApplication2Application.class, args);
		System.out.println("SpringBootEurekaClientApplication2Application is started..");
	}

}
