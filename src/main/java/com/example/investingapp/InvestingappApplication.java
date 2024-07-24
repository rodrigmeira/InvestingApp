package com.example.investingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InvestingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestingappApplication.class, args);
	}

}
