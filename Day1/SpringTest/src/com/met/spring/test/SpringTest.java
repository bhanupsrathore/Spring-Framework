package com.met.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.model.Address;
import com.met.model.Employee;

public class SpringTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		
		
		System.out.println("*************Post initialization*********************");
		
		//Employee employee1 = context.getBean(Employee.class);			//ambiguity 
		
		Employee emp1 = context.getBean("employee1", Employee.class);
		System.out.println("bean with id employee1 " + emp1);
		System.out.println("Annual Income: " + emp1.getAnnualIncome());
		
		Employee empSingleton = context.getBean("employee1", Employee.class);
		System.out.println("bean with id employee1 " + empSingleton);
		System.out.println("Annual Income: " + empSingleton.getAnnualIncome());
		
		
		Employee emp2 = context.getBean("employee2", Employee.class);
		System.out.println("bean with id employee2 " + emp2);
		System.out.println("Annual Income: " + emp2.getAnnualIncome());
		
		
		
		System.out.println("*****************prototype scope***************");
		
		Employee emp3 = context.getBean("employee3", Employee.class);
		System.out.println("bean with id employee3 " + emp3);
		System.out.println("Annual Income: " + emp3.getAnnualIncome());
		
		Employee emp3Prototype = context.getBean("employee3", Employee.class);
		System.out.println("bean with id employee3 " + emp3Prototype);
		System.out.println("Annual Income: " + emp3Prototype.getAnnualIncome());
		
		
		
		System.out.println("*****************Lazy loading*******************");
		Employee emp4 = context.getBean("employee4", Employee.class);
		System.out.println("bean with id employee4 " + emp4);
		System.out.println("Annual Income: " + emp4.getAnnualIncome());
		
		
		System.out.println("*****************COnstructor arguements*******************");
		Employee emp5 = context.getBean("employee5", Employee.class);
		System.out.println("bean with id employee5 " + emp5);
		System.out.println("Annual Income: " + emp5.getAnnualIncome());
		
		
		Employee emp6 = context.getBean("employee6", Employee.class);
		System.out.println("bean with id employee6 " + emp6);
		System.out.println("Annual Income: " + emp6.getAnnualIncome());
		
		
		System.out.println("*****************Property Setters*******************");
		Employee emp7 = context.getBean("employee7", Employee.class);
		System.out.println("bean with id employee7 " + emp7);
		System.out.println("Annual Income: " + emp7.getAnnualIncome());
		
		
		System.out.println("*****************combination of constructor and property Setters*******************");
		Employee emp8 = context.getBean("employee8", Employee.class);
		System.out.println("bean with id employee8 " + emp8);
		System.out.println("Annual Income: " + emp8.getAnnualIncome());
		
		
		
		System.out.println("***********************Address*******************");
		Address address1 = context.getBean("address1", Address.class);
		System.out.println("Bean with address1 details: " + address1);
		
		
		Employee emp9 = context.getBean("employee9", Employee.class);
		System.out.println("bean with id employee9 " + emp9);
		System.out.println("Annual Income: " + emp9.getAnnualIncome());
		
		
		
		
	}
	
}
