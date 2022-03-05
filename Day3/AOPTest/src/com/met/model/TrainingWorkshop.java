package com.met.model;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*<bean id="trainingWorkshop" class="com.met.model.TrainingWorkshop" autowire="constructor" />*/

/*<bean id="trainingWorkshop" class="com.met.model.TrainingWorkshop />"              @Component*/


/*TrainingWorkshop -> trainingWorkshop*/

@Component
public class TrainingWorkshop implements Workshop {

	private TrainingCompany trainingCompany;
	
	
	@Autowired
	public TrainingWorkshop(TrainingCompany trainingCompany) {
		super();
		this.trainingCompany = trainingCompany;
		System.out.println("TrainingWorkshop paramtererized constructor invoked");
	}
		
	/*public TrainingWorkshop(Connection trainingCompany) {
		super();
		//this.trainingCompany = trainingCompany;
		System.out.println("TrainingWorkshop paramtererized constructor invoked");
	}*/

	public TrainingWorkshop() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("TrainingWorkshop default constructor invoked");
	}
	
	public TrainingCompany getTrainingCompany() {
		return trainingCompany;
	}

	public void setTrainingCompany(TrainingCompany trainingCompany) {
		this.trainingCompany = trainingCompany;
	}

	@Override
	public void conductWorkshop() {
		
		System.out.println("TrainingWorkshop :: conductWorkshop");
		trainingCompany.conductTraining();

	}

}
