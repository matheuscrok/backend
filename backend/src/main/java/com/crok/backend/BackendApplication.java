package com.crok.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class BackendApplication {

	@RequestMapping(value ="/filme", method = RequestMethod.GET)
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
