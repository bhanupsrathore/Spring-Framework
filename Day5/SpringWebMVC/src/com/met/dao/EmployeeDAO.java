package com.met.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import javax.sql.DataSource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.met.model.Employee;

//@Component

@Repository
public class EmployeeDAO {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/*@Autowired
	public EmployeeDAO(DataSource dataSource){
		this.dataSource = dataSource;
	}*/
	

	public void saveEmployee(Employee emp){
		
		System.out.println("EmployeeDAO :: saveEmployee");
		System.out.println("Saving Employee to db with details : " + emp);
		
		
		//saveEmpUsingJDBC(emp)			//Homw work
		
		//saveUsingDataSource(emp);
		
		
		//saveUsingJDBCTemplate(emp);
		
		
		saveUsingHibernate(emp);
		
	}
	
	//JDBC  , Hibernate
	// JPA , DataSource
	
	
	private void saveEmpUsingJDBC(Employee emp){
		
	}
	
	
	private void saveUsingDataSource(Employee emp){
		try(Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into Employeetbl(id, name,designation, emailId) values(?,?,?,?)")
				){
			
			
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getDesignation());
			pstmt.setString(4, emp.getEmailId());
			
			pstmt.executeUpdate();
			
			//con.commit();
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private void saveUsingJDBCTemplate(Employee emp){
		
		
		//DataAccessException
		
		jdbcTemplate.update("insert into Employeetbl(id, name,designation, emailId) values(?,?,?,?)", 
				
				new Object[]{
						
						emp.getId(), emp.getName(),
						emp.getDesignation(), emp.getEmailId()
				}
				
				
				
				);
	}
	
	
	private void saveUsingHibernate(Employee employee){
		
		Session session = null;
		Transaction tx = null;
		
		try{
			
			session = sessionFactory.openSession();
			
			tx = session.beginTransaction();
			
			
			session.save(employee);
			
			tx.commit();
			
		}catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
		
	}
	
	public Collection<Employee> getAllEmployees(){
		
		return jdbcTemplate.query("select * from employeetbl", 
				new BeanPropertyRowMapper<Employee>(Employee.class));
		
	}
	
	
	
}

/*class CustomMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		
		int id = rs.getInt(1);
		String name = rs.getString(2);
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		
		return employee;
	}
	
	
	
}*/


