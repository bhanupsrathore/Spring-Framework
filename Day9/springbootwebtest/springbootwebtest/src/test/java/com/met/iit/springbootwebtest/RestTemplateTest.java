package com.met.iit.springbootwebtest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List> forEntity = restTemplate.getForEntity("http://localhost:8059/sbjpa/emp/getAllEmps", List.class);
		
		System.out.println(forEntity.getStatusCode());
		System.out.println(forEntity.getBody());
		
	}
	
}
