package com.guo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UmsGatewayStarter {
	public static void main(String[] args) {
		SpringApplication.run(UmsGatewayStarter.class,args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("ums",r -> r.path("/ums/**").uri("http://localhost:8080"))
				.route("check",r -> r.path("/user/**").uri("http://localhost:8888"))
				.build();
	}
}
