package com.met.model;

import java.sql.Connection;

public class TrainingWorkshop implements Workshop {

	private TrainingCompany trainingCompany;
	
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
