package com.met.iit.springbootwebtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	
	@GetMapping
	public String welcome(){
		return "Welcome to Spring boot Rest Services";
	}
}
