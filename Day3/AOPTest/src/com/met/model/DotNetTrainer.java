package com.met.model;

import java.util.List;


//POJO
public final class DotNetTrainer implements Trainer{

	private String name;
	private List<String> subjects;
	
	public DotNetTrainer(String name, List<String> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
		System.out.println("DotNetTrainer parameterized constructor invoked");
	}
	
	public DotNetTrainer() {
		super();
		System.out.println("DotNetTrainer default constructor invoked");
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
		
	/*	System.out.println("Participants are taking seats");
		System.out.println("Participants are switching off mobile phones");*/
		
		
		System.out.println("DotNetTrainer :: train()");
		System.out.println(name + " is training on DotNet subjects " + subjects);		//Business logic
		
		
		/*System.out.println("Training completed");*/
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " is a DotNet Trainer";
	}
	
}
