package com.msa.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        System.setProperty("reactor.netty.http.server.accessLogEnabled", "true");


        SpringApplication.run(GatewayApplication.class, args);
    }

}
