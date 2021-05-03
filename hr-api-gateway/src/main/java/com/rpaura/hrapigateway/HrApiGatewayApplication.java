package com.rpaura.hrapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class HrApiGatewayApplication {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("hr-worker", r -> r.path("/hr-worker/**")
						.uri("lb://HR-WORKER"))
				.route("hr-payroll", r -> r.path("/hr-payroll/**")
						.uri("lb://HR-PAYROLL"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayApplication.class, args);
	}

}
