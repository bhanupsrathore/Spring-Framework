package com.met.cdac.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {

	
	@GetMapping("user")
	public String welcom(){
		return "Welcome to Spring boot  REST services with security and user role";
	}
	
	@GetMapping("admin")
	public String welcomAdmin(){
		return "Welcome to Spring boot  REST services with security and admin role";
	}
}
