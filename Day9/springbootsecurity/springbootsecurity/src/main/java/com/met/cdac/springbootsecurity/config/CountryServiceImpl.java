package com.met.cdac.springbootsecurity.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CountryServiceImpl implements CommandLineRunner{

	/*@Autowired
	private DataSource dataSource;*/
	
	@Override
	public void run(String... args) throws Exception {
	
		
		
		System.out.println("Creating Country cache");
		
		
		System.out.println("Cache created....");
			
		
	}
	
	
	
}
