package com.met.iit.springbootwebtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringbootwebtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebtestApplication.class, args);
	}

	
	//@ComponentScan(basePackages="com.met.iit.springbootwebtest.*")
	
	//@SpringBootApplication     -> @Configuration + @ComponentScan + @EnableAutoConfiguration
	
}
