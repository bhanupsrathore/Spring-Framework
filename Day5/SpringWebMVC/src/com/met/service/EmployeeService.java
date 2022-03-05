package com.met.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.met.dao.EmployeeDAO;
import com.met.model.Employee;

//@Component

@Service
public class EmployeeService {

	//private EmployeeDAO employeeDAO = new EmployeeDAO();
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void saveEmployee(Employee emp){
		
		System.out.println("EmployeeService :: saveEmployee");
		
		//perform user validation
		
		if(emp.getId() <= 0 ){
			throw new RuntimeException("Age cannot be <= 0");
		}
		
		employeeDAO.saveEmployee(emp);
		
	}
	
	public Collection<Employee> getAllEmployees(){
		
		return employeeDAO.getAllEmployees();
		
	}
	
}
