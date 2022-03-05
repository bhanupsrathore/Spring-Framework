package com.met.iit.springbootwebtest.dao;

import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.met.iit.springbootwebtest.model.Employee;

@Repository
public class EmployeeDAO {

	//@Autowired
	private DataSource dataSource;
	
	//@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDAO(DataSource dataSource, JdbcTemplate jdbcTemplate) {
		super();
		this.dataSource = dataSource;
		this.jdbcTemplate = jdbcTemplate;
		
		System.out.println("DataSource and JDBCTemplate bean inejected created by SpringAUTOCOnfiguration");
	}
	
	public void saveEmployee(Employee emp){
		
		
		jdbcTemplate.update("insert into Employeetbl(id, name,designation, emailId) values(?,?,?,?)", 
				new Object[]{
						
						emp.getId(), emp.getName(),
						emp.getDesignation(), emp.getEmailId()
				}
		);
	}

	
	public Collection<Employee> getAllEmployees(){
		
		return jdbcTemplate.query("select * from employeetbl", 
				new BeanPropertyRowMapper<Employee>(Employee.class));
		
	}
	
	public Employee getEmployee(int empId){
		
		return jdbcTemplate.queryForObject("select * from employeetbl where id=?", 
				new BeanPropertyRowMapper<Employee>(Employee.class), empId);
		
	}
	
}




