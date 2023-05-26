package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigs {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		
		return builder.routes()
				.route(p->p.path("/note/**").uri("lb://NOTE-SERVICE"))
				.route(p->p.path("/comments/**").uri("lb://COMMENTS-SERVICE"))
				.build();
	}
	
}
