package org.learners.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
//Routing is an integral part of a microservice architecture. For example,
//   '/' may be mapped to your web application,
//    '/api/users' is mapped to the user service and /api/shop is mapped 
// to the shop service. Zuul is a JVM-based router and server-side load 
// balancer from Netflix.
@EnableZuulProxy
@EnableEurekaClient
//@EnableDiscoveryClient
public class ZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServiceApplication.class, args);
	}

}
