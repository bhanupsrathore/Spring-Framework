package com.met.cdac.springbootwebjpa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.met.cdac.springbootwebjpa.model.Employee;
import com.met.cdac.springbootwebjpa.service.EmployeeService;

@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="getAllEmps", produces={MediaType.APPLICATION_JSON_VALUE})
	public Collection<Employee> getAllEmployees(){
		
		return employeeService.getAllEmployees();
		
	}
	
	@GetMapping(value="getEmp/{id}", produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Employee getEmployee(@PathVariable int id){
		
		return employeeService.getEmployee(id);
		
	}
	
	
	@PostMapping(value="saveEmp", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee saveEmployee(@RequestBody Employee employee){
		
		employeeService.saveEmployee(employee);
		
		return employee;
		
	}
	
	
	
}



