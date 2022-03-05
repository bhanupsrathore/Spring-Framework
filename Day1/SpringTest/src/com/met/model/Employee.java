package com.met.model;

public class Employee {

	private static int count;
	
	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	private Address address;
	
	public Employee(){
		id = ++count;
		System.out.println("Default employee object created with id: " + id);
	}

	public Employee(String name, int age){
		
		this();
		
		this.name = name;
		this.age = age;
		this.designation = "FRESHER";
		this.salary = 25000;
	
		
		System.out.println("Paramaterized constructor invoked..");
	}
	
		
	
	public Employee(String name, int age, String designation, double salary, Address address) {
		this();
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
		System.out.println("Paramaterized constructor invoked with all arguements.......");
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + ", salary="
				+ salary + ", address=" + address + "]";
	}

	public double getAnnualIncome(){
		
		return salary * 12;
		
	}
	
}
