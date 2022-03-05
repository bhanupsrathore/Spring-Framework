package com.met.cdac.springbootwebjpa.dao;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.met.cdac.springbootwebjpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}


//Repository
//CRUDRepository							->Create, Update, Read, Delete 
//PagingAndSortingRepository				-> 50 at time, sort your records
//JPARepository								-> ORM