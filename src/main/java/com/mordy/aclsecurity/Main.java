
package com.mordy.aclsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mordy.aclsecurity.jpa.CustomerRepository;

@SpringBootApplication
public class Main{

	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		SpringApplication.run(Main.class);
	}

	@Bean
	public CommandLineRunner initDb(CustomerRepository repository) {
		return (args) -> {
			
		};
	}

}