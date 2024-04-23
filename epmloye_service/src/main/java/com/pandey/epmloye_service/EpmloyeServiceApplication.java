package com.pandey.epmloye_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients  //this is added to use 3rd method to implement sync comm from emplo to dept microserv
public class EpmloyeServiceApplication {
	//we are using method 1 to call one micro to other:Rest template
//1	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}// webclien is the 2nd thing to use for sync communication bw microservices
	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EpmloyeServiceApplication.class, args);
	}

}
