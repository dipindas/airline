package com.sample.airline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sample.airline.*")
public class AirlineApplication {

	public static void main(String[] args) {
		System.out.println(">>>>>>>>>>>>>>>>>>>> started");
		SpringApplication.run(AirlineApplication.class, args);
	}

}
