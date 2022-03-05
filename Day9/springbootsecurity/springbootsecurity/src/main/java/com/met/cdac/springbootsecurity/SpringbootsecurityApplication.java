package com.met.cdac.springbootsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootsecurityApplication implements CommandLineRunner{		//ApplicationRunner

	public static void main(String[] args) {
		System.out.println("Initialization of Spring COntainer");
		
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootsecurityApplication.class, args);
		
		//System.out.println("Create cache");
		
		
		System.out.println("Completed Initialization of Spring COntainer");
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		
		System.out.println("Creating cache");
		
		System.out.println("Cache Creation completed");
		
	}
	
	
	

}
