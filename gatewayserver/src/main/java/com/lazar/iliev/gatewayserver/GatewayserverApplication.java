package com.lazar.iliev.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import java.time.LocalDateTime;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public RouteLocator lazarRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(p ->
						p.path("/lazar/profile/**")
								.filters(f -> f.rewritePath("/lazar/profile/(?<segment>.*)", "/${segment}")
										.addResponseHeader("X-Response-Times", LocalDateTime.now().toString()))
								.uri("lb://PROFILE")
				)
				.route(p ->
						p.path("/lazar/news/**")
								.filters(f -> f.rewritePath("/lazar/news/(?<segment>.*)", "/${segment}"))
								.uri("lb://NEWS")
				)
				.route(p ->
						p.path("/lazar/work/**")
								.filters(f -> f.rewritePath("/lazar/work/(?<segment>.*)", "/${segment}"))
								.uri("lb://WORK")
				)
				.build();
	}
}
