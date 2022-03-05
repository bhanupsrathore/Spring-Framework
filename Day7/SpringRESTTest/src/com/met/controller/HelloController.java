package com.met.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/hello")
public class HelloController {
	
	public HelloController(){
		
		System.out.println("***************************HelloController*******************************");
		
	}
	
	//@RequestMapping(method=RequestMethod.GET)
	@GetMapping
	public ModelAndView welcome(){
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("welcomeMsg", "Welcome to Spring Web MVC");   //set model in MVC
		
		mv.setViewName("hello");					 //  /WEB-INF/pages/hello.jsp
		
		
		return mv;
		
	}
	
	
	//http://localhost:8055/SpringRESTTest/mvcweb/hello/requestParam?username=Jack&age=22
	
	//String username = request.getParameter("username");
	//int age = Integer.parseInt(request.getParameter("age"));
	
	
	@RequestMapping(value="requestParam", method=RequestMethod.GET)
	public ModelAndView handleRequestParam(@RequestParam(name="uname") String username, @RequestParam(required=false, defaultValue="22") int age){
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("welcomeMsg", "Welcome to Spring Web MVC from " + username + " with age: " + age);   //set model in MVC
		
		mv.setViewName("hello");					 //  /WEB-INF/pages/hello.jsp
		
		
		return mv;
		
	}
	
	
	//PathVariable
	//http://localhost:8055/SpringRESTTest/mvcweb/hello/pathvar/Jack/22
	
	//http://localhost:8055/SpringRESTTest/mvcweb/employee?id=1
	//http://localhost:8055/SpringRESTTest/mvcweb/employee/1
	
	//@RequestMapping(value="pathVar/{name}/{age}", method=RequestMethod.GET)
	@GetMapping("pathVar/{name}/{age}")
	public ModelAndView handlePathVariable(@PathVariable String name, @PathVariable int age){
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("welcomeMsg", "Welcome to Spring Web MVC from " + name + " with age: " + age);   //set model in MVC
		
		mv.setViewName("hello");					 //  /WEB-INF/pages/hello.jsp
		
		
		return mv;
		
	}
	
	
	
	
	
}
