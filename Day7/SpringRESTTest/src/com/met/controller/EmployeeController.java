package com.met.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.met.model.Employee;
import com.met.service.EmployeeService;

//@Component
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	// http://localhost:8055/SpringWebMVC/mvcweb/employee
	
	//private EmployeeService employeeService = new EmployeeService();
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ModelAndView initializeEmployee(){
		
		ModelAndView mv = new ModelAndView();
		
		Employee employ = new Employee();
		employ.setDesignation("FRESHER");
		
		
		mv.addObject("employee", employ);
				//request.setAttribute("employee", employ);
		
		mv.setViewName("emp");
		
		
		Collection<Employee> employees = employeeService.getAllEmployees();
		
		mv.addObject("listEmployees", employees);
		
		return mv;
		
	}
	
	@PostMapping
	public ModelAndView saveEmployee(@ModelAttribute Employee employee){
		
		
		employeeService.saveEmployee(employee);
		
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("emp");

		
		//below 3 lines are to clear the form 
		Employee employ = new Employee();
		employ.setDesignation("FRESHER");	
		mv.addObject("employee", employ);
		
		Collection<Employee> employees = employeeService.getAllEmployees();
		
		mv.addObject("listEmployees", employees);
		
		
		return mv;
		
		
	}
	
	
	@ExceptionHandler
	public ModelAndView handleException(Exception ex, HttpServletRequest request){
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("exMsg", ex.getMessage());
		mv.addObject("url", request.getRequestURI());
		
		mv.setViewName("error");
		
		return mv;
	}
	
}










