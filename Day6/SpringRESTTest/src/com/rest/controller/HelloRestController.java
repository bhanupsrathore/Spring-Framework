package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/welcome")
public class HelloRestController {

	
	//REST service  -> combination of @Controller + @ResponseBody
	
	//@RESTController -> @Controller + @ResponseBody
	
	/*@GetMapping
	public @ResponseBody String hello(){
		
		return "Welcome to Spring REST services";
		
	}*/
	
	@GetMapping
	public String hello(){
		
		return "Welcome to Spring REST services";
		
	}
	
}
