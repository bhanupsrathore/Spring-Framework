package com.met.cdac.springbootwebjpa.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.met.cdac.springbootwebjpa.model.Employee;

@Repository
public class EmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	/*@Autowired 
	private SessionFactory sessionFactory;*/
	
	public void saveEmployee(Employee emp){
		
		entityManager.persist(emp);
		
	}
	
	
	public Collection<Employee> getAllEmployees(){
		
		//Session openSession = sessionFactory.openSession();
		
		return entityManager.createQuery("from Employee e", Employee.class).getResultList();
		
	}
	
	
	public Employee getEmployee(int empId){
		
		return entityManager.find(Employee.class, empId);
		
	}
	
}
