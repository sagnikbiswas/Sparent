package com.sagnik.sparent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SparentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SparentApplication.class, args);
	}

}
