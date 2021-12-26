package com.java.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSampleWebApplication {


private static final Logger log = LoggerFactory.getLogger(SpringbootSampleWebApplication.class);

	public static void main(String[] args) {
		
		log.info("Äpplication Starting...........");
		SpringApplication.run(SpringbootSampleWebApplication.class, args);
	}

}
