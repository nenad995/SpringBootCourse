package com.nenad.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.nenad.springcoredemo",
							"com.nenad.util"}
)
public class SpringcoredemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
