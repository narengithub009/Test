package com.java.demo.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/date")
	public String showCurrentDate() {
		log.info("Date : {}", new Date().toString());
		
		return new Date().toString();
	}
}