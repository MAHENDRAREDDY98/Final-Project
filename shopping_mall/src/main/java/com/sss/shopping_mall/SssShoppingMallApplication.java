package com.sss.shopping_mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SssShoppingMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SssShoppingMallApplication.class, args);
	}

}
