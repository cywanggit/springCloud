package com.springcolud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.demo"})
public class ClientApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
}
