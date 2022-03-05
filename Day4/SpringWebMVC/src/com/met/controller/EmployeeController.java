package com.met.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.met.model.Employee;

@Component
@RequestMapping("/employee")
public class EmployeeController {

	// http://localhost:8055/SpringWebMVC/mvcweb/employee
	
	@GetMapping
	public ModelAndView initializeEmployee(){
		
		ModelAndView mv = new ModelAndView();
		
		Employee employ = new Employee();
		employ.setDesignation("FRESHER");
		
		
		mv.addObject("employee", employ);
		
		
		mv.setViewName("emp");
		
		
		return mv;
		
	}
	
	@PostMapping
	public ModelAndView saveEmployee(@ModelAttribute Employee employee){
		ModelAndView mv = new ModelAndView();
		
		System.out.println(employee);
		
		//save this to db
		
		return mv;
		
		
	}
	
}
