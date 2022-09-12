package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication {
	
	
		@RequestMapping("/")
		public String hello() {
			return "Hello Abhijeet";
		}


	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
