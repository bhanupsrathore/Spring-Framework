package com.met.model;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*<bean id="metSolutions" class="com.met.model.METSolutions" autowire="byType" />*/

/*<bean id="metSolutions" class="com.met.model.METSolutions" />      @Component        */

/*autowire="byType"               -> @Autowired*/

 /*METSolutions -> METSolutions*/

@Component("metSolutions")
public class METSolutions implements TrainingCompany{

	/*@Autowired
	@Qualifier("javaTrainer2")
	private Trainer trainer;

	
	public METSolutions(Trainer trainer) {
		super();
		this.trainer = trainer;
		System.out.println("METSolutions paramtererized constructor invoked");
	}

	public METSolutions() {
		super();
		System.out.println("METSolutions default constructor invoked");
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void conductTraining() {
		
		System.out.println("METSolutions :: conductTraining");
		trainer.train();
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "METSolutions is a Training Company";
	}*/
	
	
	@Autowired
	//@Qualifier("javaTrainer2")
	private List<Trainer> trainers;

	
	public METSolutions(List<Trainer> trainer) {
		super();
		this.trainers = trainer;
		System.out.println("METSolutions paramtererized constructor invoked");
	}

	public METSolutions() {
		super();
		System.out.println("METSolutions default constructor invoked");
	}

	

	public List<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}

	@Override
	public void conductTraining() {
		
		System.out.println("METSolutions :: conductTraining");
		for(Trainer trainer : trainers){
			trainer.train();
		}
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "METSolutions is a Training Company";
	}
	
}
