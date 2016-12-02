package com.sermo.system;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaDisoveryApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaDisoveryApplication.class).web(true).run(args);
	}
}
