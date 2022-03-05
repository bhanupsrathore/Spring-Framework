package com.met.model;

import java.util.List;
import java.util.Random;


//POJO
public class JavaTrainer implements Trainer{

	private String name;
	private List<String> subjects;
	
	public JavaTrainer(String name, List<String> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
		System.out.println("JavaTrainer parameterized constructor invoked");
	}
	
	public JavaTrainer() {
		super();
		System.out.println("JavaTrainer default constructor invoked");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public void train() {
		
		/*System.out.println("Participants are taking seats");
		System.out.println("Participants are switching off mobile phones");*/
		
		
		Random rnd = new Random();
		int nextValue = rnd.nextInt(10);
		
		if(nextValue < 5){
			throw new RuntimeException("Training failed");
		}
		
		
		System.out.println("JavaTrainer :: train()");
		System.out.println(name + " is training on java subjects " + subjects);
		
		
		/*System.out.println("Training completed");*/
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " is a Java Trainer";
	}
	
}
