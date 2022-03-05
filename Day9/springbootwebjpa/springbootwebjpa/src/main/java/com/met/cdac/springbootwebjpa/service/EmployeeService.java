package com.met.cdac.springbootwebjpa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.met.cdac.springbootwebjpa.config.EmailConfigProperties;
import com.met.cdac.springbootwebjpa.dao.EmployeeDAO;
import com.met.cdac.springbootwebjpa.dao.EmployeeRepository;
import com.met.cdac.springbootwebjpa.model.Employee;

//@Component

@Service
public class EmployeeService {

	//private EmployeeDAO employeeDAO = new EmployeeDAO();
	
	/*@Autowired
	private EmployeeDAO employeeDAO;*/
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	private EmailConfigProperties emailConfigProperties;
	
	@Transactional(rollbackFor=Exception.class, timeout=10)			//declarative transaction manager
	public void saveEmployee(Employee emp){
		
		System.out.println("EmployeeService :: saveEmployee");
		
		//perform user validation
		
		if(emp.getId() <= 0 ){
			throw new RuntimeException("Age cannot be <= 0");
		}
		
		//employeeDAO.saveEmployee(emp);
		
		
		employeeRepository.save(emp);
		
		System.out.println("Sending email from: " + emailConfigProperties.getFrom());
		System.out.println("ServerName: " + emailConfigProperties.getServer());
		System.out.println("Using PortNo: " + emailConfigProperties.getPortNo());
		System.out.println("Subject: " + emailConfigProperties.getSubject());
		
		System.out.println("Email To: " + emp.getEmailId());
		
		
	}
	
	public Collection<Employee> getAllEmployees(){
		
		//return employeeDAO.getAllEmployees();
		
		System.out.println("employeeRepository: " + employeeRepository.getClass());
		
		return employeeRepository.findAll();
		
	}
	
	public Employee getEmployee(int id){
		//System.out.println(employeeDAO.getClass());
		//return employeeDAO.getEmployee(id);
		
		return employeeRepository.findById(id).get();
		
	}
	
}
