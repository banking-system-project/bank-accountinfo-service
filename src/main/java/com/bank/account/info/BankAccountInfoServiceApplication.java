package com.bank.account.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class BankAccountInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountInfoServiceApplication.class, args);
	}


}
