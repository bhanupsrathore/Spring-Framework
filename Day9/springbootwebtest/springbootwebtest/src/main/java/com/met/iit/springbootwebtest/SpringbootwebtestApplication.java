package com.met.iit.springbootwebtest;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)

//@Configuration
//@ComponentScan("com.met.iit.springbootwebtest.*")
//@EnableAutoConfiguration
public class SpringbootwebtestApplication {
	//DataSourceAutoConfiguration
	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebtestApplication.class, args);
		
		for(String arg : args){
			System.out.println(arg);
		}
		
	}

	
	@Bean
	public DataSource dataSource(){
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("system");
		ds.setPassword("admin123");
		
		return ds;
		
	}
	
	
	
	//@ComponentScan(basePackages="com.met.iit.springbootwebtest.*")
	
	//@SpringBootApplication     -> @Configuration + @ComponentScan + @EnableAutoConfiguration
	
	//@ComponnentScan("com.met.iit.springbootwebtest.*")
	
	//com.met.iit.springbootwebtest.*
	//com.met.iit.service
	
	
}
