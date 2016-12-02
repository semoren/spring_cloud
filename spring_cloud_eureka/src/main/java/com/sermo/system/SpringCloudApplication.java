package com.sermo.system;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer //启动一个服务注册中心提供给其他应用
@SpringBootApplication
public class SpringCloudApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringCloudApplication.class).web(true).run(args);
	}
}
